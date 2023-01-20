package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.jobportal.entity.Job;
import com.cg.jobportal.repository.JobsRepository;

@Service
public class JobsServiceImplementation implements JobsService {
	
	
	@Autowired
	JobsRepository jar;
	
	@Override
	public Job addjob(Job jobs) {
		Job pj = jar.save(jobs);
		return pj;
	}
	
	@Override
	public List<Job> findAll() {
		return jar.findAll();
	}
	
	@Override
	public Optional<Job> findById(long id) {
		return jar.findById(id);
	}


    @Override
	public String deletejob(long id) {
		if (jar.existsById(id)) {
             jar.deleteById(id);
		}
		return "Doesn't Exists";
		
    }



}




