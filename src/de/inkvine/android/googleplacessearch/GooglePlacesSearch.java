package de.inkvine.android.googleplacessearch;

import java.util.List;

import android.location.Location;
import de.inkvine.android.googleplacessearch.exceptions.APIKeyNotSetException;
import de.inkvine.android.googleplacessearch.exceptions.LocationNotAvailableException;
import de.inkvine.android.googleplacessearch.model.Place;

/**
 * The GooglePlacesSearch will return places that correspond to the filter
 * criterias provided to the search-Method.
 * 
 * The searchForStores-Method is just a convenient method to search for stores
 * that correspond to the provided store names.
 * 
 * Beware. A lot of threads will be instantiated when filtering. Assure you have
 * network access as the Google Places API needs to be consumed via HTTP.
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public interface GooglePlacesSearch {

	/**
	 * @param key
	 */
	public void setAPIKey(String key);

	/**
	 * @param location
	 */
	public void setLocation(Location location);

	/**
	 * @param location
	 * @return
	 */
	public Location getLocation(Location location);

	/**
	 * @param storeNames
	 * @param radius
	 * @param resultsPerCriteria
	 * @return
	 * @throws LocationNotAvailableException
	 * @throws APIKeyNotSetException
	 */
	public List<Place> searchForStores(List<String> storeNames, int radius)
			throws LocationNotAvailableException, APIKeyNotSetException;

	/**
	 * @param criterias
	 * @param radius
	 * @return
	 * @throws LocationNotAvailableException
	 * @throws APIKeyNotSetException
	 */
	public List<Place> search(List<FilterCriteria> criterias, int radius)
			throws LocationNotAvailableException, APIKeyNotSetException;

}
