package de.inkvine.android.samples;

import java.util.ArrayList;
import java.util.List;

import android.location.Location;
import android.util.Log;
import de.inkvine.android.googleplacessearch.GooglePlacesSearch;
import de.inkvine.android.googleplacessearch.exceptions.APIKeyNotSetException;
import de.inkvine.android.googleplacessearch.exceptions.LocationNotAvailableException;
import de.inkvine.android.googleplacessearch.exceptions.RequestException;
import de.inkvine.android.googleplacessearch.filter.FilterCriteria;
import de.inkvine.android.googleplacessearch.filter.LimitedResultFilterCriteria;
import de.inkvine.android.googleplacessearch.filter.impl.FilterCriteriaImpl;
import de.inkvine.android.googleplacessearch.filter.impl.FilterCriteriaWithLimitedResultImpl;
import de.inkvine.android.googleplacessearch.impl.DefaultGooglePlacesSearch;
import de.inkvine.android.googleplacessearch.model.Place;

public class Samples {

	public void sampleStoreSearch(Location location, String apiKey) {

		ArrayList<String> storeNames = new ArrayList<String>();
		storeNames.add("Esprit");
		storeNames.add("Mexx");
		storeNames.add("Tchibo");

		GooglePlacesSearch placesSearch = new DefaultGooglePlacesSearch(
				location, apiKey);

		// in meter
		int radiusToSearchFor = 1000;
		try {
			List<Place> places = placesSearch.searchForStores(storeNames,
					radiusToSearchFor);
			for (Place place : places) {

				// Get all the stuff about the found place
				// eg the name
				Log.i("sampleStoreSearch", place.getName());

			}
		} catch (LocationNotAvailableException e) {

			e.printStackTrace();
		} catch (APIKeyNotSetException e) {

			e.printStackTrace();
		} catch (RequestException e) {

			Log.e("sampleStoreSearch", e.getGeneratedURL());
			e.printStackTrace();
		}

	}

	public void sampleSearchWithCustomResultFilterCriteria(Location location,
			String apiKey) {

		ArrayList<String> placesNames = new ArrayList<String>();
		placesNames.add("Esprit");
		placesNames.add("Mexx");
		placesNames.add("Tchibo");

		GooglePlacesSearch placesSearch = new DefaultGooglePlacesSearch(
				location, apiKey);

		List<FilterCriteria> searchFilters = new ArrayList<FilterCriteria>();

		// Build list of filter criteria
		for (String name : placesNames) {

			LimitedResultFilterCriteria filter = new FilterCriteriaWithLimitedResultImpl(
					name);

			// Set results that will come back for THIS filter
			filter.setMaxResults(3);

			// Add a type to the filter...you can add multiple if you like
			filter.addPlacesType(FilterCriteria.FILTER_TYPE_STORE);

			// Add filter to the list
			searchFilters.add(filter);

		}

		// Just add another filter that has an unlimited number of results

		String additionalPlaceName = "A place name";

		FilterCriteria additionalFilter = new FilterCriteriaImpl(
				additionalPlaceName);
		additionalFilter.addPlacesType(FilterCriteria.FILTER_TYPE_ATM);
		additionalFilter.addPlacesType(FilterCriteria.FILTER_TYPE_BEAUTY_SALON);

		searchFilters.add(additionalFilter);

		// set radius of search
		int radiusToSearchFor = 1000;

		try {
			List<Place> places = placesSearch.search(searchFilters,
					radiusToSearchFor);
			for (Place place : places) {

				// Get all the stuff about the found place
				// eg the name
				Log.i("sampleSearchWithCustomResultFilterCriteria",
						place.getName());

			}
		} catch (LocationNotAvailableException e) {

			e.printStackTrace();
		} catch (APIKeyNotSetException e) {

			e.printStackTrace();
		} catch (RequestException e) {

			Log.e("sampleSearchWithCustomResultFilterCriteria",
					e.getGeneratedURL());
			e.printStackTrace();

		}

	}

}
