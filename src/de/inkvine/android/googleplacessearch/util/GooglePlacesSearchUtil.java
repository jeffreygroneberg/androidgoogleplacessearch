package de.inkvine.android.googleplacessearch.util;

import java.util.List;

/**
 * Util class with some constants and a convenient method to build the URL to
 * the Google Places API.
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class GooglePlacesSearchUtil {

	public static String PLACES_API_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
	public static String PLACES_LOCATION_PARAM = "location";
	public static String PLACES_RADIUS_PARAM = "radius";
	public static String PLACES_TYPES_PARAM = "types";
	public static String PLACES_NAME_PARAM = "name";
	public static String PLACES_SENSOR_PARAM = "sensor";
	public static String PLACES_KEY_PARAM = "key";

	public static String buildPlacesAPIRequestUrl(String searchName,
			String apiKey, double latitute, double longitute, int radius,
			List<String> typeList) {

		// build types String
		String types = "";

		// if there is just one type in the list, create the string now
		if (typeList.size() == 1)
			types += typeList.get(0);

		else {

			for (int i = 0; i < typeList.size(); i++)

				if (i < (typeList.size() - 1))
					types += typeList.get(i) + "|";
				else
					types += typeList.get(i);

		}

		// "&rankby=distance&" +
		return PLACES_API_URL + PLACES_LOCATION_PARAM + "=" + latitute + ","
				+ longitute + "&" + PLACES_RADIUS_PARAM + "=" + radius + "&"
				+ PLACES_TYPES_PARAM + "=" + types + "&" + PLACES_NAME_PARAM
				+ "=" + searchName + "&" + PLACES_SENSOR_PARAM + "=true&"
				+ PLACES_KEY_PARAM + "=" + apiKey;

	}

}
