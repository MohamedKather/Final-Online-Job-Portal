package com.cg.jobportal.exceptions;

/***********************************************
 * 
 * @author Mohammed kather
 * Created Date: 23 January, 2023 
 * Description: Invalid Admin Exception class
 *
 ************************************************/
public class InvalidAdminException extends Exception{
	

	public InvalidAdminException(String msg) {
		super(msg);
		
	}

	public InvalidAdminException() {
		super();
	}

}
