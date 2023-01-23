package com.cg.jobportal.exceptions;
/**************************************************************************************
 * @author       Shifa Khanam Attar 
 * Description : This is bookmarked freelancer already exists exception  class . 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/
public class BookmarkedFreelancerAlreadyExistsException extends Exception{


	public BookmarkedFreelancerAlreadyExistsException(String msg) {
		super(msg);
	}

	public BookmarkedFreelancerAlreadyExistsException() {
		super();
	}
}
