package de.inkvine.android.googleplacessearch.filter;

public interface LimitedResultFilterCriteria extends FilterCriteria {
	
	public static int MAX_RESULTS_DEFAULT = 2;

	public int getMaxResults();

	public void setMaxResults(int maxResult);

}
