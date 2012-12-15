package de.inkvine.android.googleplacessearch;

public interface LimitedResultFilterCriteria extends FilterCriteria {

	public int getMaxResults();

	public void setMaxResults(int maxResult);

}
