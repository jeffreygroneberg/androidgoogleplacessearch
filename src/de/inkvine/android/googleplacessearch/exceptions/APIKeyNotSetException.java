package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that will be thrown if there is no API key given to a places filter
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class APIKeyNotSetException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3515814883636277892L;

	public APIKeyNotSetException() {

		super();
	}

	public APIKeyNotSetException(String detailsMessage, Throwable throwable) {

		super(detailsMessage, throwable);

	}

	public APIKeyNotSetException(String detailsMessage) {

		super(detailsMessage);

	}

}
