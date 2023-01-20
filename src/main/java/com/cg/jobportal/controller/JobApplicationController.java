package com.cg.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.JobApplication;
import com.cg.jobportal.exceptions.NoElementFoundException;
import com.cg.jobportal.service.JobApplicationService;
import jakarta.validation.Valid;

@RestController
public class JobApplicationController {

	@Autowired
	private JobApplicationService jobApplicationService;

	@PostMapping(value = "/applyJob")
	public ResponseEntity<String> applyToJob(@RequestBody JobApplication jobApplication) {
		JobApplication jp = jobApplicationService.applyToJob(jobApplication);
		return new ResponseEntity<>("Job Applied Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/findAllJob")
	public ResponseEntity<List<JobApplication>> findAll() {
		return new ResponseEntity<>(jobApplicationService.findAll(), HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Object> remove(@Valid @PathVariable long id) throws NoElementFoundException {
		jobApplicationService.remove(id);
		return new ResponseEntity<>("job application deleted successfully", HttpStatus.OK);
	}

	@PutMapping(value = "/updateJob/{id}")
	public ResponseEntity<Object> updateJobApplication(@Valid @PathVariable long id,
			@RequestBody JobApplication jobApplication) {
		jobApplicationService.updateJobApplication(id, jobApplication);
		return new ResponseEntity<>("job application updated successfully", HttpStatus.OK);
	}
}
