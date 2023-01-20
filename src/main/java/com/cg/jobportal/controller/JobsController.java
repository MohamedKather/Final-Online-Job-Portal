package com.cg.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Job;
import com.cg.jobportal.service.JobsService;

@RestController
public class JobsController {
	
	
	@Autowired
	JobsService js; 
	
	@PostMapping("/postJob")
	public ResponseEntity<Object> job(@RequestBody Job jobs) {
		js.addjob(jobs);
		return new ResponseEntity<>("Job Posted Successfully", HttpStatus.OK);
	}
	
	
	@GetMapping("/findAllJobPost")
	public ResponseEntity<Object> findAll() {
		return new ResponseEntity<>(js.findAll(), HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/findJobById/{id}")
	public ResponseEntity<Object> findById(@PathVariable long id) {
			return new ResponseEntity<>(js.findById(id), HttpStatus.OK);
	}

	
	@DeleteMapping("/deletejob/{id}")
	public ResponseEntity<Object> deletejob(@PathVariable long id) {
			js.deletejob(id);
		return new ResponseEntity<>("deleted successfully", HttpStatus.OK);

	}
}
