package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that will be thrown if the limit of requests to the Google Places
 * API has been reached.
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class RequestLimitExceededException extends RequestException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3515814883636277892L;

	public RequestLimitExceededException(String detailsMessage, String url) {
		super(detailsMessage, url);
		// TODO Auto-generated constructor stub
	}

	public RequestLimitExceededException(String detailsMessage,
			Throwable throwable, String url) {
		super(detailsMessage, throwable, url);
		// TODO Auto-generated constructor stub
	}

	public RequestLimitExceededException(String url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

}
