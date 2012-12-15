package de.inkvine.android.googleplacessearch.impl;

import java.util.ArrayList;
import java.util.List;

import de.inkvine.android.googleplacessearch.FilterCriteria;

public class FilterCriteriaImpl implements FilterCriteria {

	/**
	 * The name of the place we are looking for
	 */
	private String placesName;

	/**
	 * A list of type of the place we are looking for
	 */
	private List<String> typeList;

	public FilterCriteriaImpl(String placesName, List<String> typeList) {

		this.typeList = typeList;
		this.placesName = placesName;

	}

	public FilterCriteriaImpl(String placesName) {

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

}
