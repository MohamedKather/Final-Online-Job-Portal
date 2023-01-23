package com.cg.jobportal.exceptions;

/****************************************************
 * 
 * @author Mohammed Kather
 * Created Date: 23 January, 2023 
 * Description: Invalid Feedback Exception class
 *
 *****************************************************/
public class InvalidFeedbackException extends Exception {

	public InvalidFeedbackException(String msg) {
		super(msg);
	}

	public InvalidFeedbackException() {
		super();
	}

}
