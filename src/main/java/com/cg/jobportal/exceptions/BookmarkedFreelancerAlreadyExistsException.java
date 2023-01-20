package com.cg.jobportal.exceptions;

public class BookmarkedFreelancerAlreadyExistsException extends Exception{
	private String msg;

	public BookmarkedFreelancerAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}

	public BookmarkedFreelancerAlreadyExistsException() {
		super();
	}
}
