package com.cg.jobportal.exceptions;

public class AdminAlreadyExistException extends Exception{
	
	private String msg;

	public AdminAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}

	public AdminAlreadyExistException() {
		super();
	}
	
	

}
