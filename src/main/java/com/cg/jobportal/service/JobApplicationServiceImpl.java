package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.JobApplication;
import com.cg.jobportal.exceptions.InvalidJobApplicationException;
import com.cg.jobportal.exceptions.JobApplicationAlreadyExistException;
import com.cg.jobportal.exceptions.JobApplicationNotFoundException;
import com.cg.jobportal.repository.JobApplicationRepository;


@Service
public class JobApplicationServiceImpl implements JobApplicationService {

	@Autowired
	private JobApplicationRepository jobApplicationRepository;

	@Override
	public JobApplication applyToJob(JobApplication jobApplication) throws JobApplicationAlreadyExistException {
		if (jobApplicationRepository.existsById(jobApplication.getId())) {
			throw new JobApplicationAlreadyExistException();
		}

		return jobApplicationRepository.save(jobApplication);
	}

	@Override
	public List<JobApplication> findAll() {
		return jobApplicationRepository.findAll();
	}

	@Override
	public void remove(long id) throws JobApplicationNotFoundException {
		if (jobApplicationRepository.existsById(id)) {

			jobApplicationRepository.deleteById(id);
		} else
			throw new JobApplicationNotFoundException();
	}

	@Override
	public JobApplication updateJobApplication(long id, JobApplication jobApplication)
			throws InvalidJobApplicationException {
		if (jobApplicationRepository.existsById(id)) {
			return jobApplicationRepository.save(jobApplication);
		} else
			throw new InvalidJobApplicationException();

	}

}