package com.cg.jobportal.exceptions;

/*******************************************************
 * 
 * @author vedavyas
 * Created Date: 23 January, 2023 
 * Description: Invalid Recruiter Exception class
 *
 *******************************************************/

public class InvalidRecruiterException extends Exception {


	public InvalidRecruiterException(String msg) {
		super(msg);
	}

	public InvalidRecruiterException() {
		super();
	}

}
