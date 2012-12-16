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
public class FilterCriteriaWithLimitedResultImpl extends FilterCriteriaImpl
		implements LimitedResultFilterCriteria {

	/**
	 * The name of the place we are looking for
	 */
	private String placesName;

	/**
	 * A list of type of the place we are looking for
	 */
	private List<String> typeList;

	private int maxResults = -1;

	public FilterCriteriaWithLimitedResultImpl(String placesName,
			List<String> typeList, int maxResults) {

		super(placesName, typeList);
		this.maxResults = maxResults;

	}

	public FilterCriteriaWithLimitedResultImpl(String placesName,
			List<String> typeList) {

		super(placesName, typeList);
		this.maxResults = 2;

	}

	public FilterCriteriaWithLimitedResultImpl(String placesName) {

		super(placesName);

		this.placesName = placesName;
		this.maxResults = 2;

	}

	@Override
	public String getPlacesName() {

		return placesName;
	}

	@Override
	public List<String> getPlacesTypes() {

		return typeList;
	}

	@Override
	public void addPlacesType(String type) {

		if (typeList == null)
			typeList = new ArrayList<String>();

		typeList.add(type);

	}

	@Override
	public int getMaxResults() {

		return maxResults;
	}

	@Override
	public void setMaxResults(int maxResults) {

		this.maxResults = maxResults;
	}

}
