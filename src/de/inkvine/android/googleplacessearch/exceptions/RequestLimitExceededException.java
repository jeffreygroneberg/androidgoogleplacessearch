package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that will be thrown if the limit of requests to the Google Places
 * API has been reached.
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class RequestLimitExceededException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3515814883636277892L;

	public RequestLimitExceededException() {

		super();
	}

	public RequestLimitExceededException(String detailsMessage,
			Throwable throwable) {

		super(detailsMessage, throwable);

	}

	public RequestLimitExceededException(String detailsMessage) {

		super(detailsMessage);

	}

}
