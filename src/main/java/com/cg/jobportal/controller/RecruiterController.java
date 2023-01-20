package com.cg.jobportal.controller;

import java.util.List;
import java.util.Optional;

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

import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.exceptions.RecruiterAlreadyExistException;
import com.cg.jobportal.service.RecruiterService;
@RestController
public class RecruiterController {
	
	@Autowired
	public RecruiterService recServ;

	@PostMapping("/saveRecruiter")
	public ResponseEntity<Recruiter> saveRecruiter(@RequestBody Recruiter rec) throws RecruiterAlreadyExistException{
		Recruiter savedRecruiter = recServ.saveRecruiter(rec);
		return new ResponseEntity<>(savedRecruiter, HttpStatus.CREATED);
	}
	
	@GetMapping("/allRecruiter")
	public ResponseEntity<List<Recruiter>> getAllRecruiter() {
		List<Recruiter> Recruiter = recServ.getAllRecruiters();
		return new ResponseEntity<>(Recruiter, HttpStatus.OK);
	}
	
	@GetMapping("/allRecruiters/{id}")
	public ResponseEntity<Optional<Recruiter>> getRecruiterById(@PathVariable Long id) {
		Optional<Recruiter> recruiter = recServ.getRecruiterById(id);
		return new ResponseEntity<>(recruiter, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteRecruiterId/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		String delete = recServ.deleteById(id);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}
	
	@PutMapping("/updateRecruiter")
	public ResponseEntity<Recruiter> updateRecruiter(@RequestBody Recruiter  rec){
		Recruiter update =recServ.updateRecruiter(rec);
		return new ResponseEntity<>(update, HttpStatus.ACCEPTED);
		
	}
	
}
