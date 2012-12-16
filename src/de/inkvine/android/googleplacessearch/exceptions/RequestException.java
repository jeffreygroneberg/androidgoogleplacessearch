package de.inkvine.android.googleplacessearch.exceptions;

public class RequestException extends Exception {

	private String generatedURL;

	private static final long serialVersionUID = -2307147481433177066L;

	public RequestException(String url) {

		super();
		this.generatedURL = url;
	}

	public RequestException(String detailsMessage, Throwable throwable,
			String url) {

		super(detailsMessage, throwable);
		this.generatedURL = url;

	}

	public RequestException(String detailsMessage, String url) {

		super(detailsMessage);
		this.generatedURL = url;

	}

	public String getGeneratedURL() {
		return generatedURL;
	}

	public void setGeneratedURL(String generatedURL) {
		this.generatedURL = generatedURL;
	}

}
