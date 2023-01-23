package com.cg.jobportal.exceptions;
/**************************************************************************************
 * @author       Arpitha sp 
 * Description : This is freelancer already exist exception class. 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/
public class FreelancerAlreadyExistException extends Exception {
	

	public FreelancerAlreadyExistException(String msg) {
		super(msg);

	}

	public FreelancerAlreadyExistException() {
		super();
	}

}
