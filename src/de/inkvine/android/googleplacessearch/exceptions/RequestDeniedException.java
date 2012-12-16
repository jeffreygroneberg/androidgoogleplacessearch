package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that will be thrown if the request is denied by the Google Places Service
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class RequestDeniedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3515814883636277892L;

	public RequestDeniedException() {

		super();
	}

	public RequestDeniedException(String detailsMessage, Throwable throwable) {

		super(detailsMessage, throwable);

	}

	public RequestDeniedException(String detailsMessage) {

		super(detailsMessage);

	}

}
