androidgoogleplacessearch
=========================

library to use the google places easily and filter by your needs


		storeNames = new ArrayList<String>();
		storeNames.add("Esprit");
		storeNames.add("Mexx");
		storeNames.add("Tchibo");
		
		
		// Acquire android.Location.location from the LocationManager of Android		

		GooglePlacesSearch placesSearch = new DefaultGooglePlacesSearch(
				location, PLACES_API_KEY);
		try {
			List<Place> places = placesSearch.searchForStores(storeNames, 1000);
			for (Place place : places) {

				// Get all the stuff about the found place

			}
		} catch (LocationNotAvailableException e) {

			e.printStackTrace();
		} catch (APIKeyNotSetException e) {

			e.printStackTrace();
		}