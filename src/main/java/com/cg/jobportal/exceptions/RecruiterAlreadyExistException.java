package com.cg.jobportal.exceptions;

/************************************************************
 * 
 * @author vedavyas
 * Created Date: 23 January, 2023 
 * Description: Recruiter Already Exist Exception class
 *
 ************************************************************/
public class RecruiterAlreadyExistException extends Exception {

	public RecruiterAlreadyExistException(String msg) {
		super(msg);
	}

	public RecruiterAlreadyExistException() {
		super();
	}
	
	
}
