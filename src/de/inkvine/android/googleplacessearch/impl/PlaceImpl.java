package de.inkvine.android.googleplacessearch.impl;

import java.util.List;

import de.inkvine.android.googleplacessearch.filter.FilterCriteria;
import de.inkvine.android.googleplacessearch.model.Geometry;
import de.inkvine.android.googleplacessearch.model.Location;
import de.inkvine.android.googleplacessearch.model.OpeningHour;
import de.inkvine.android.googleplacessearch.model.Place;

/**
 * This class acts as a wrapper to abstract all those generated and fuzzy
 * classes to get GSON to work.
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
class PlaceImpl implements Place {

	private Results gsonResultType;
	private FilterCriteria criteria;

	public PlaceImpl(Results gsonResultType, FilterCriteria criteria) {

		this.gsonResultType = gsonResultType;
		this.criteria = criteria;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getGeometry()
	 */
	@Override
	public Geometry getGeometry() {

		// wrap the generated stuff to avoid hard binding to it when using the
		// api
		return new Geometry() {

			@Override
			public Location getLocation() {

				return new Location() {

					@Override
					public Number getLng() {

						return gsonResultType.getGeometry().getLocation()
								.getLng();

					}

					@Override
					public Number getLat() {

						return gsonResultType.getGeometry().getLocation()
								.getLat();
					}
				};
			}
		};

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getIcon()
	 */
	@Override
	public String getIcon() {

		return gsonResultType.getIcon();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getId()
	 */
	@Override
	public String getId() {

		return gsonResultType.getId();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getName()
	 */
	@Override
	public String getName() {

		return gsonResultType.getName();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getOpeningHour()
	 */
	@Override
	public OpeningHour getOpeningHour() {

		return new OpeningHour() {

			@Override
			public boolean isNowOpen() {

				return gsonResultType.getOpening_hours().getOpen_now();
			}
		};

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getReference()
	 */
	@Override
	public String getReference() {

		return gsonResultType.getReference();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getTypes()
	 */
	@Override
	public List<String> getTypes() {

		return gsonResultType.getTypes();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getVicinity()
	 */
	@Override
	public String getVicinity() {

		return gsonResultType.getVicinity();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.inkvine.googleplacessearch.model.Place#getRelatedFilterCriteria()
	 */
	@Override
	public FilterCriteria getRelatedFilterCriteria() {

		return this.criteria;

	}

}
