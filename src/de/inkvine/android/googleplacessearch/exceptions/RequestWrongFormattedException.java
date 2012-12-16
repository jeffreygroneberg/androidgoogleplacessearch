package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that will be thrown if the request has the wrong format.
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class RequestWrongFormattedException extends RequestException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3515814883636277892L;

	public RequestWrongFormattedException(String detailsMessage, String url) {
		super(detailsMessage, url);
		// TODO Auto-generated constructor stub
	}

	public RequestWrongFormattedException(String detailsMessage,
			Throwable throwable, String url) {
		super(detailsMessage, throwable, url);
		// TODO Auto-generated constructor stub
	}

	public RequestWrongFormattedException(String url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

}
