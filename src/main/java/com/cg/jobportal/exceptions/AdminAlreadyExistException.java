package com.cg.jobportal.exceptions;
/**************************************************************************************
 * @author       Mohamed kather 
 * Description : This is admin already exists exception class . 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/
public class AdminAlreadyExistException extends Exception{
	

	public AdminAlreadyExistException(String msg) {
		super(msg);
	}

	public AdminAlreadyExistException() {
		super();
	}
	
	

}
