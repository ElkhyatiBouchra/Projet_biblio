package com.firstprojet.dao.exceptions;

public class EntityNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntityNotFoundException() {

	}

	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public EntityNotFoundException(String message) {
		super(message);

	}

}
