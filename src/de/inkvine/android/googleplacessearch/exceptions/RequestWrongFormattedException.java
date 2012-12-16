package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that will be thrown if the request has the wrong format.
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class RequestWrongFormattedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3515814883636277892L;

	public RequestWrongFormattedException() {

		super();
	}

	public RequestWrongFormattedException(String detailsMessage,
			Throwable throwable) {

		super(detailsMessage, throwable);

	}

	public RequestWrongFormattedException(String detailsMessage) {

		super(detailsMessage);

	}

}
