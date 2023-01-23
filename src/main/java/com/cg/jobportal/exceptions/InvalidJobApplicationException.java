package com.cg.jobportal.exceptions;


public class InvalidJobApplicationException extends Exception {
	public InvalidJobApplicationException(String msg) {
		super(msg);
	}

	public InvalidJobApplicationException() {
		super();
	}
}
