package com.cg.jobportal.exceptions;

public class NoElementFoundException extends Exception {

	String msg;

	public NoElementFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public NoElementFoundException() {
		super();
	}
}
	
