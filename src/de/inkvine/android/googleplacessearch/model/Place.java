package de.inkvine.android.googleplacessearch.model;

import java.util.List;

import de.inkvine.android.googleplacessearch.filter.FilterCriteria;

/**
 * A place that corresponds to one of the filter criterias given 
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 *
 */
/**
 * @author d044987
 *
 */
public interface Place {

	/**
	 * @return
	 */
	public abstract Geometry getGeometry();

	/**
	 * @return
	 */
	public abstract String getIcon();

	/**
	 * @return
	 */
	public abstract String getId();

	/**
	 * @return
	 */
	public abstract String getName();

	/**
	 * @return
	 */
	public abstract OpeningHour getOpeningHour();

	/**
	 * @return
	 */
	public abstract String getReference();

	/**
	 * @return
	 */
	public abstract List<String> getTypes();

	/**
	 * @return
	 */
	public abstract String getVicinity();

	/**
	 * @return
	 */
	public abstract FilterCriteria getRelatedFilterCriteria();

}