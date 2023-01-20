package com.cg.jobportal.service;

import java.util.List;

import com.cg.jobportal.entity.JobApplication;
import com.cg.jobportal.exceptions.NoElementFoundException;




public interface JobApplicationService  {

	JobApplication applyToJob(JobApplication jobApplication);

	List<JobApplication> findAll();

	void remove(long id) throws NoElementFoundException;
	
	JobApplication updateJobApplication(long id,JobApplication jobApplication);
	
	//List<JobApplication> findAllByJobId(Long jobId);
	
	//List<JobApplication> findByFreeLancerid(Long freelancerId);


	
}
