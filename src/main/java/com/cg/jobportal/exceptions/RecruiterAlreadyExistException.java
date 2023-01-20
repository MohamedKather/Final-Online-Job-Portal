package com.cg.jobportal.exceptions;

public class RecruiterAlreadyExistException extends Exception {
	private String msg;

	public RecruiterAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}

	public RecruiterAlreadyExistException() {
		super();
	}
	
	
}
