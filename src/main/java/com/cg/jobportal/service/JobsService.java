package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Job;

public interface JobsService {

	
	Job addjob(Job jobs);
	
	List<Job> findAll();
	
	Optional<Job> findById(long id);
	
	String deletejob(long id);
	
	
}
