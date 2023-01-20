package com.cg.jobportal.exceptions;

public class NoBookmarkedFreelancerExistsException extends Exception{
	
	private String msg;

	
	public NoBookmarkedFreelancerExistsException(String msg) {
		super();
		this.msg = msg;
	}

	public NoBookmarkedFreelancerExistsException() {
		super();
	}
}
