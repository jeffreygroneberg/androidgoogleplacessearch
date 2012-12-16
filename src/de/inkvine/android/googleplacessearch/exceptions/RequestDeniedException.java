package de.inkvine.android.googleplacessearch.exceptions;

/**
 * Exception that will be thrown if the request is denied by the Google Places
 * Service
 * 
 * @author Jeffrey Groneberg (www.twitter.com/inkvine)
 * 
 */
public class RequestDeniedException extends RequestException {

	private static final long serialVersionUID = -3515814883636277892L;

	public RequestDeniedException(String detailsMessage, String url) {
		super(detailsMessage, url);

	}

	public RequestDeniedException(String detailsMessage, Throwable throwable,
			String url) {
		super(detailsMessage, throwable, url);

	}

	public RequestDeniedException(String url) {
		super(url);

	}

}
