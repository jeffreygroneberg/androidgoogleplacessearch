package de.inkvine.android.googleplacessearch.impl;

import java.util.ArrayList;
import java.util.List;

import de.inkvine.android.googleplacessearch.LimitedResultFilterCriteria;

/**
 * Default implementation of a LimitedResultFilterCriteria. This class assures
 * that the search will return max two results
 * 
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class FilterCriteriaWithLimitedResultImpl implements
		LimitedResultFilterCriteria {

	/**
	 * The name of the place we are looking for
	 */
	private String placesName;

	/**
	 * A list of type of the place we are looking for
	 */
	private List<String> typeList;

	public FilterCriteriaWithLimitedResultImpl(String placesName) {

		this.placesName = placesName;

	}

	public FilterCriteriaWithLimitedResultImpl(String placesName,
			List<String> typeList) {

		this.typeList = typeList;
		this.placesName = placesName;

	}

	@Override
	public String getPlacesName() {

		return placesName;
	}

	@Override
	public List<String> getPlacesTypes() {
		// TODO Auto-generated method stub
		return typeList;
	}

	@Override
	public void addPlacesType(String type) {

		if (typeList == null)
			typeList = new ArrayList<String>();

		typeList.add(type);

	}

	@Override
	public int maxResults() {
		// TODO Auto-generated method stub
		return 2;
	}

}
