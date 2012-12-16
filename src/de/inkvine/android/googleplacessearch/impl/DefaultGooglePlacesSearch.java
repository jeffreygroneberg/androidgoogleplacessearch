package de.inkvine.android.googleplacessearch.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import android.location.Location;
import android.text.TextUtils;

import com.google.gson.Gson;

import de.inkvine.android.googleplacessearch.GooglePlacesSearch;
import de.inkvine.android.googleplacessearch.exceptions.APIKeyNotSetException;
import de.inkvine.android.googleplacessearch.exceptions.LocationNotAvailableException;
import de.inkvine.android.googleplacessearch.filter.FilterCriteria;
import de.inkvine.android.googleplacessearch.filter.LimitedResultFilterCriteria;
import de.inkvine.android.googleplacessearch.filter.impl.FilterCriteriaWithLimitedResultImpl;
import de.inkvine.android.googleplacessearch.model.Place;
import de.inkvine.android.googleplacessearch.util.GooglePlacesSearchUtil;

/**
 * Default implementation of a GooglePlacesSearch
 * 
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class DefaultGooglePlacesSearch implements GooglePlacesSearch {

	private Location location;
	private String apiKey;

	public DefaultGooglePlacesSearch(Location location, String apiKey) {

		this.location = location;
		this.apiKey = apiKey;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.inkvine.googleplacesfilter.PlacesFilter#setLocation(android.location
	 * .Location)
	 */
	@Override
	public void setLocation(Location location) {

		this.location = location;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.inkvine.googleplacesfilter.PlacesFilter#getLocation(android.location
	 * .Location)
	 */
	@Override
	public Location getLocation(Location location) {

		return location;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.inkvine.googleplacesfilter.PlacesFilter#setAPIKey(java.lang.String)
	 */
	public void setAPIKey(String key) {

		this.apiKey = key;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.inkvine.googleplacesfilter.PlacesFilter#filterStores(java.util.List,
	 * int)
	 */
	@Override
	public List<Place> searchForStores(List<String> storeNames, int radius)
			throws LocationNotAvailableException, APIKeyNotSetException {

		if (location == null)
			throw new LocationNotAvailableException(
					"No location set. Filtering not possible");

		List<FilterCriteria> descriptions = new ArrayList<FilterCriteria>();

		for (String item : storeNames) {

			FilterCriteria criteria = new FilterCriteriaWithLimitedResultImpl(
					item);
			criteria.addPlacesType(FilterCriteria.FILTER_TYPE_STORE);

			descriptions.add(criteria);

		}

		return this.search(descriptions, radius);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacesfilter.PlacesFilter#filter(java.util.List,
	 * int)
	 */
	@Override
	public List<Place> search(List<? extends FilterCriteria> criterias, final int radius)
			throws LocationNotAvailableException, APIKeyNotSetException {

		final List<Place> aggregatedList = new ArrayList<Place>();

		if (location == null)
			throw new LocationNotAvailableException(
					"No location set. Filtering not possible");

		if (TextUtils.isEmpty(apiKey))
			throw new APIKeyNotSetException(
					"No API Key is set. Filtering not possible");

		List<Thread> threadList = new ArrayList<Thread>();

		// Create threads
		for (final FilterCriteria item : criterias) {

			threadList.add(new Thread() {
				@Override
				public void run() {

					PlacesResponse resp = searchForSurroundingPlaces(location,
							item, radius);

					List<Results> results = resp.getResults();

					if (results != null && results.size() > 0) {

						// our result is limited
						if (item instanceof LimitedResultFilterCriteria) {

							int resultNumber = Math.min(
									((LimitedResultFilterCriteria) item)
											.getMaxResults(), results.size());

							for (int i = 0; i < resultNumber; i++) {

								aggregatedList.add(new PlaceImpl(
										results.get(i), item));

							}

						} else

							for (Results resultItem : results) {

								aggregatedList.add(new PlaceImpl(resultItem,
										item));
							}

					}

				}
			});

		}

		// start threads
		for (Thread thread : threadList)
			thread.start();

		// wait till they are finished
		for (Thread thread : threadList)
			try {
				thread.join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		return aggregatedList;

	}

	/**
	 * This method will search for
	 * 
	 * @param location
	 * @param criteria
	 * @param radius
	 * @return
	 */
	private PlacesResponse searchForSurroundingPlaces(Location location,
			FilterCriteria criteria, int radius) {
		URL url = null;
		try {
			url = new URL(GooglePlacesSearchUtil.buildPlacesAPIRequestUrl(
					criteria.getPlacesName(), apiKey, location.getLatitude(),
					location.getLongitude(), radius, criteria.getPlacesTypes()));
			System.out.println(url);
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

		HttpURLConnection con = null;
		try {
			con = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		try {
			return parseResponse(con.getInputStream());
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param in
	 * @return
	 */
	private PlacesResponse parseResponse(InputStream in) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		Gson gson = new Gson();
		PlacesResponse response = gson.fromJson(reader, PlacesResponse.class);

		return response;

	}

}
