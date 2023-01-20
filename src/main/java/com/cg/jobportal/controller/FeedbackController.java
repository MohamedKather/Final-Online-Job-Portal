package com.cg.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.entity.Feedback;
import com.cg.jobportal.exceptions.InvalidAdminException;
import com.cg.jobportal.service.FeedbackService;


@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedserv;

	
	@PostMapping("/addFeedback")
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback) {
		Feedback feed=feedserv.addFeedback(feedback);
		return new ResponseEntity<Feedback>(feed, HttpStatus.OK);
	}
	
	@GetMapping("/getAllFeedback")
	public ResponseEntity<List<Feedback>> getAllFeedbacks(){
		List<Feedback> Feedbacks=feedserv.getAllFeedbacks();
		return new ResponseEntity<List<Feedback>>(Feedbacks, HttpStatus.OK);
	}
	
	@PutMapping("/updateFeedback")
	public ResponseEntity<Feedback> updateFeedback(@RequestBody Feedback ent){
		Feedback update=feedserv.updateFeedback(ent);
		return new ResponseEntity<Feedback>(update, HttpStatus.ACCEPTED);
		
	}
}
