package com.cg.jobportal.exceptions;



public class JobApplicationAlreadyExistException extends Exception {
	
	public JobApplicationAlreadyExistException(String msg) {
		super(msg);
	}

	public JobApplicationAlreadyExistException() {
		super();
	}
}
