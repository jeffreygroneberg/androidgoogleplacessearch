package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that is thrown if no location has been given to
 * an GooglePlacesSearch instance
 * 
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 *
 */
public class LocationNotAvailableException extends Exception {	
	
	private static final long serialVersionUID = -2331848295501265048L;

	public LocationNotAvailableException() {

		super();
	}

	public LocationNotAvailableException(String detailsMessage,
			Throwable throwable) {

		super(detailsMessage, throwable);

	}

	public LocationNotAvailableException(String detailsMessage) {

		super(detailsMessage);

	}

}
