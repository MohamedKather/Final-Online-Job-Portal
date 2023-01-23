package com.cg.jobportal.exceptions;


public class JobAlreadyExistException extends Exception{

	public JobAlreadyExistException(String msg) {
		super(msg);
	}

	public JobAlreadyExistException() {
		super();
	}

}
