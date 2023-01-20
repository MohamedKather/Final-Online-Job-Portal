package com.cg.jobportal.exceptions;

public class InvalidSkillException extends Exception{
	private String msg;

	public InvalidSkillException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidSkillException() {
		super();
	}
	

}
