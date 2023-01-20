package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.JobApplication;
import com.cg.jobportal.exceptions.NoElementFoundException;
import com.cg.jobportal.repository.JobApplicationRepository;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {
	@Autowired
	JobApplicationRepository jar;

	@Override
	public JobApplication applyToJob(JobApplication jobApplication) {

		return jar.save(jobApplication);
	}

	@Override
	public List<JobApplication> findAll() {
		return jar.findAll();
	}

	@Override
	public void remove(long id) throws NoElementFoundException {
		if (jar.existsById(id)) {

			jar.deleteById(id);
		} else
			throw new NoElementFoundException();
	}

	@Override
	public JobApplication updateJobApplication(long id, JobApplication jobApplication) {
		JobApplication jobApplication1 = jar.findById(id).get();
		jar.save(jobApplication);

		return jobApplication;
	}

}
