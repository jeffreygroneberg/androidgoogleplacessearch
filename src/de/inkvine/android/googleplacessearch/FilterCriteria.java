package de.inkvine.android.googleplacessearch;

import java.util.List;

/**
 * A FilterCriteria acts as an abstraction on how places shall be filtered
 * that are nearby. 
 * 
 * The places name will act as a search query for a nearby search.
 * The places type will act as an additional criteria to compress the 
 * search to just some type of place (check the constants of this interface
 * to get an impression of which types are available).
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public interface FilterCriteria {

	public String FILTER_TYPE_ACCOUNTING = "accounting";
	public String FILTER_TYPE_AIRPORT = "airport";
	public String FILTER_TYPE_AMUSEMENT_PARK = "amusement_park";
	public String FILTER_TYPE_AQUARIUM = "aquarium";
	public String FILTER_TYPE_ART_GALLERY = "art_gallery";
	public String FILTER_TYPE_ATM = "atm";
	public String FILTER_TYPE_BAKERY = "bakery";
	public String FILTER_TYPE_BANK = "bank";
	public String FILTER_TYPE_BAR = "bar";
	public String FILTER_TYPE_BEAUTY_SALON = "beauty_salon";
	public String FILTER_TYPE_BICYCLE_STORE = "bicycle_store";
	public String FILTER_TYPE_BOOK_STORE = "book_store";
	public String FILTER_TYPE_BOWLING_ALLEY = "bowling_alley";
	public String FILTER_TYPE_BUS_STATION = "bus_station";
	public String FILTER_TYPE_CAFE = "cafe";
	public String FILTER_TYPE_CAMPGROUND = "campground";
	public String FILTER_TYPE_CAR_DEALER = "car_dealer";
	public String FILTER_TYPE_CAR_RENTAL = "car_rental";
	public String FILTER_TYPE_CAR_REPAIR = "car_repair";
	public String FILTER_TYPE_CAR_WASH = "car_wash";
	public String FILTER_TYPE_CASINO = "casino";
	public String FILTER_TYPE_CEMETERY = "cemetery";
	public String FILTER_TYPE_CHURCH = "church";
	public String FILTER_TYPE_CITY_HALL = "city_hall";
	public String FILTER_TYPE_CLOTHING_STORE = "clothing_store";
	public String FILTER_TYPE_CONVENIENCE_STORE = "convenience_store";
	public String FILTER_TYPE_COURTHOUSE = "courthouse";
	public String FILTER_TYPE_DENTIST = "dentist";
	public String FILTER_TYPE_DEPARTMENT_STORE = "department_store";
	public String FILTER_TYPE_DOCTOR = "doctor";
	public String FILTER_TYPE_ELECTRICIAN = "electrician";
	public String FILTER_TYPE_ELECTRONICS_STORE = "electronics_store";
	public String FILTER_TYPE_EMBASSY = "embassy";
	public String FILTER_TYPE_ESTABLISHMENT = "establishment";
	public String FILTER_TYPE_FINANCE = "finance";
	public String FILTER_TYPE_FIRE_STATION = "fire_station";
	public String FILTER_TYPE_FLORIST = "florist";
	public String FILTER_TYPE_FOOD = "food";
	public String FILTER_TYPE_FUNERAL_HOME = "funeral_home";
	public String FILTER_TYPE_FURNITURE_STORE = "furniture_store";
	public String FILTER_TYPE_GAS_STATION = "gas_station";
	public String FILTER_TYPE_GENERAL_CONTRACTOR = "general_contractor";
	public String FILTER_TYPE_GROCERY_OR_SUPERMARKET = "grocery_or_supermarket";
	public String FILTER_TYPE_GYM = "gym";
	public String FILTER_TYPE_HAIR_CARE = "hair_care";
	public String FILTER_TYPE_HARDWARE_STORE = "hardware_store";
	public String FILTER_TYPE_HEALTH = "health";
	public String FILTER_TYPE_HINDU_TEMPLE = "hindu_temple";
	public String FILTER_TYPE_HOME_GOODS_STORE = "home_goods_store";
	public String FILTER_TYPE_HOSPITAL = "hospital";
	public String FILTER_TYPE_INSURANCE_AGENCY = "insurance_agency";
	public String FILTER_TYPE_JEWELRY_STORE = "jewelry_store";
	public String FILTER_TYPE_LAUNDRY = "laundry";
	public String FILTER_TYPE_LAWYER = "lawyer";
	public String FILTER_TYPE_LIBRARY = "library";
	public String FILTER_TYPE_LIQUOR_STORE = "liquor_store";
	public String FILTER_TYPE_LOCAL_GOVERNMENT_OFFICE = "local_government_office";
	public String FILTER_TYPE_LOCKSMITH = "locksmith";
	public String FILTER_TYPE_LODGING = "lodging";
	public String FILTER_TYPE_MEAL_DELIVERY = "meal_delivery";
	public String FILTER_TYPE_MEAL_TAKEAWAY = "meal_takeaway";
	public String FILTER_TYPE_MOSQUE = "mosque";
	public String FILTER_TYPE_MOVIE_RENTAL = "movie_rental";
	public String FILTER_TYPE_MOVIE_THEATER = "movie_theater";
	public String FILTER_TYPE_MOVING_COMPANY = "moving_company";
	public String FILTER_TYPE_MUSEUM = "museum";
	public String FILTER_TYPE_NIGHT_CLUB = "night_club";
	public String FILTER_TYPE_PAINTER = "painter";
	public String FILTER_TYPE_PARK = "park";
	public String FILTER_TYPE_PARKING = "parking";
	public String FILTER_TYPE_PET_STORE = "pet_store";
	public String FILTER_TYPE_PHARMACY = "pharmacy";
	public String FILTER_TYPE_PHYSIOTHERAPIST = "physiotherapist";
	public String FILTER_TYPE_PLACE_OF_WORSHIP = "place_of_worship";
	public String FILTER_TYPE_PLUMBER = "plumber";
	public String FILTER_TYPE_POLICE = "police";
	public String FILTER_TYPE_POST_OFFICE = "post_office";
	public String FILTER_TYPE_REAL_ESTATE_AGENCY = "real_estate_agency";
	public String FILTER_TYPE_RESTAURANT = "restaurant";
	public String FILTER_TYPE_ROOFING_CONTRACTOR = "roofing_contractor";
	public String FILTER_TYPE_RV_PARK = "rv_park";
	public String FILTER_TYPE_SCHOOL = "school";
	public String FILTER_TYPE_SHOE_STORE = "shoe_store";
	public String FILTER_TYPE_SHOPPING_MALL = "shopping_mall";
	public String FILTER_TYPE_SPA = "spa";
	public String FILTER_TYPE_STADIUM = "stadium";
	public String FILTER_TYPE_STORAGE = "storage";
	public String FILTER_TYPE_STORE = "store";
	public String FILTER_TYPE_SUBWAY_STATION = "subway_station";
	public String FILTER_TYPE_SYNAGOGUE = "synagogue";
	public String FILTER_TYPE_TAXI_STAND = "taxi_stand";
	public String FILTER_TYPE_TRAIN_STATION = "train_station";
	public String FILTER_TYPE_TRAVEL_AGENCY = "travel_agency";
	public String FILTER_TYPE_UNIVERSITY = "university";
	public String FILTER_TYPE_VETERINARY_CARE = "veterinary_care";
	public String FILTER_TYPE_ZOO = "zoo";

	/**
	 * @return
	 */
	public String getPlacesName();

	/**
	 * @param type
	 */
	public void addPlacesType(String type);

	/**
	 * @return
	 */
	public List<String> getPlacesTypes();

}
