package com.cg.jobportal.exceptions;

public class BookmarkedJobExistException extends Exception {
	
	private String msg;

	public BookmarkedJobExistException(String msg) {
		super();
		this.msg = msg;
	}

	public BookmarkedJobExistException() {
		super();
	}
	

}
