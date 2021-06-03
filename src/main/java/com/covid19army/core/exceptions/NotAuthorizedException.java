package com.covid19army.core.exceptions;

public class NotAuthorizedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4644806280490261460L;
	
	public NotAuthorizedException() {
		super();
	}

	public NotAuthorizedException(final String message) {
		super(message);
	}

} 
