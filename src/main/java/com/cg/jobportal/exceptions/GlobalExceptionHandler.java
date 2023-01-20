package com.cg.jobportal.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = AdminAlreadyExistException.class)
	public ResponseEntity<String> adminAlreadyExistException(AdminAlreadyExistException msg) {
		return new ResponseEntity<String>("Admin Already Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = RecruiterAlreadyExistException.class)
	public ResponseEntity<String> RecruiterAlreadyExistsException(RecruiterAlreadyExistException user) {
		return new ResponseEntity<String>("Recruiter already exist", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = BookmarkedFreelancerAlreadyExistsException.class)
	public ResponseEntity<String> BookmarkedFreelancerAlreadyExistsException(
			BookmarkedFreelancerAlreadyExistsException msg) {
		return new ResponseEntity<String>("Bookmarked freelancer already exists, please try with another freelancer",
				HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = NoBookmarkedFreelancerExistsException.class)
	public ResponseEntity<String> NoBookmarkedFreelancerExistsException(NoBookmarkedFreelancerExistsException msg) {
		return new ResponseEntity<String>(" No bookmarked freelancer exists", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = InvalidAdminException.class)
	public ResponseEntity<String> invalidAdminException(InvalidAdminException msg) {
		return new ResponseEntity<String>("Admin Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=NoElementFoundException.class)
	public ResponseEntity<String> NoElementFoundException(NoElementFoundException msg){
		return new ResponseEntity<>("The entered id doesnt exist",HttpStatus.CONFLICT);
	} 

}