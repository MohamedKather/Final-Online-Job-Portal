package com.cg.jobportal.exceptions;
/**************************************************************************************
 * @author       Team
 * Description : This is the Global Exception Handler class. 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = AdminAlreadyExistException.class)
	public ResponseEntity<String> adminAlreadyExistException(AdminAlreadyExistException msg) {
		return new ResponseEntity<>("Admin Already Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = RecruiterAlreadyExistException.class)
	public ResponseEntity<String> recruiterAlreadyExistException(RecruiterAlreadyExistException user) {
		return new ResponseEntity<>("Recruiter already exist", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = BookmarkedFreelancerAlreadyExistsException.class)
	public ResponseEntity<String> bookmarkedFreelancerAlreadyExistsException(
			BookmarkedFreelancerAlreadyExistsException msg) {
		return new ResponseEntity<>("Bookmarked freelancer already exists, please try with another freelancer",
				HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = InvalidBookmarkedFreelancerException.class)
	public ResponseEntity<String> invalidBookmarkedFreelancerException(InvalidBookmarkedFreelancerException msg) {
		return new ResponseEntity<>(" No bookmarked freelancer exists", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = InvalidAdminException.class)
	public ResponseEntity<String> invalidAdminException(InvalidAdminException msg) {
		return new ResponseEntity<>("Admin Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value=JobApplicationNotFoundException.class)
	public ResponseEntity<String> jobApplicationNotFoundException(JobApplicationNotFoundException msg){
		return new ResponseEntity<>("The entered job application id doesnt exist",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = JobApplicationAlreadyExistException.class)
	public ResponseEntity<String> jobApplicationAlreadyExistException(JobApplicationAlreadyExistException msg) {
		return new ResponseEntity<>("JobApplication Already Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = InvalidJobApplicationException.class)
	public ResponseEntity<String> invalidJobApplicationException(InvalidJobApplicationException msg) {
		return new ResponseEntity<>("Job Application Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = InvalidJobException.class)
	public ResponseEntity<String> invalidJobException(InvalidJobException msg) {
		return new ResponseEntity<>("Job Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = JobAlreadyExistException.class)
	public ResponseEntity<String> jobAlreadyExistException(JobAlreadyExistException msg) {
		return new ResponseEntity<>("Job Already Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

	
	@ExceptionHandler(value = InvalidFreelancerException.class)
	public ResponseEntity<String> invalidFreelancerException(InvalidFreelancerException msg) {
		return new ResponseEntity<>("Freelancer Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = InvalidFeedbackException.class)
	public ResponseEntity<String> invalidFeedbackException(InvalidFeedbackException msg) {
		return new ResponseEntity<>("Feedback Doesn't Exist,Please Try Again.", HttpStatus.CONFLICT);
	}

    @ExceptionHandler(value=InvalidSkillException.class)
    public ResponseEntity<String>invalidSkillException(InvalidSkillException msg){
    	return new ResponseEntity<>("Skill already exists , please try with another skill", HttpStatus.CONFLICT);
    }
    @ExceptionHandler(value=InvalidSkillExperienceException.class)
    public ResponseEntity<String>invalidSkillExperienceException(InvalidSkillExperienceException msg){
    	return new ResponseEntity<>("Skill Experience doesn't exist",HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value=SkillAlreadyExistsException.class)
    public ResponseEntity<String>skillAlreadyExistsException(SkillAlreadyExistsException msg){
    	return new ResponseEntity<>("Skill Already Exists,Please Try Again.", HttpStatus.CONFLICT);
    }
    
    @ExceptionHandler(value = FreelancerAlreadyExistException.class)
	public ResponseEntity<String> freelancerAlreadyExistException(FreelancerAlreadyExistException msg) {
		return new ResponseEntity<>("Freelancer Already Exist,Please Try Again.", HttpStatus.CONFLICT);

	}
	
	@ExceptionHandler(value=SkillExperienceAlreadyExistException.class)
    public ResponseEntity<String>skillExperienceAlreadyExistException(SkillExperienceAlreadyExistException msg){
    	return new ResponseEntity<>("Skill Experience Already Exists,Please Try Again.", HttpStatus.CONFLICT);
    }
}