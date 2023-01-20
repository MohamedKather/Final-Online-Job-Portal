package com.cg.jobportal.exceptions;

public class InvalidAdminException extends Exception{
	
	private String msg;

	public InvalidAdminException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidAdminException() {
		super();
	}

}
