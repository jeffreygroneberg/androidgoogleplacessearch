package de.inkvine.android.googleplacessearch.impl;

import java.util.List;

class Results {
	private Geometry geometry;
	private String icon;
	private String id;
	private String name;
	private Opening_hours opening_hours;
	private String reference;
	private List<String> types;
	private String vicinity;

	public Geometry getGeometry() {
		return this.geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Opening_hours getOpening_hours() {
		return this.opening_hours;
	}

	public void setOpening_hours(Opening_hours opening_hours) {
		this.opening_hours = opening_hours;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public List<String> getTypes() {
		return this.types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public String getVicinity() {
		return this.vicinity;
	}

	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}
}
