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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.BookmarkedFreelancer;
import com.cg.jobportal.exceptions.BookmarkedFreelancerAlreadyExistsException;
import com.cg.jobportal.exceptions.NoBookmarkedFreelancerExistsException;
import com.cg.jobportal.service.BookmarkedFreelancerService;



@RestController
public class BookmarkedFreelancerController {
	
	@Autowired
	BookmarkedFreelancerService bookfreeServ;
	
	@PostMapping("/saveBookmarkedFreelancer")
	public ResponseEntity<BookmarkedFreelancer> saveBookmarkedFreelancer(@RequestBody BookmarkedFreelancer bmark)throws BookmarkedFreelancerAlreadyExistsException {
		BookmarkedFreelancer savedBookmarkedFreelancer=bookfreeServ.saveBookmarkedFreelancer(bmark);
		return new ResponseEntity<BookmarkedFreelancer>(savedBookmarkedFreelancer, HttpStatus.CREATED);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<BookmarkedFreelancer>> getAllBookmarkedFreelancer(){
		List<BookmarkedFreelancer> allBookmarkedFreelancer = bookfreeServ.getAllBookmarkedFreelancer();
		return new ResponseEntity<List<BookmarkedFreelancer>>(allBookmarkedFreelancer, HttpStatus.OK);
	}
	@GetMapping("/getBookmarkedFreelancer/{id}")
	public ResponseEntity<Optional<BookmarkedFreelancer>> getBookmarkedFreelancerById(@PathVariable long id) throws NoBookmarkedFreelancerExistsException{
		Optional<BookmarkedFreelancer> bmarkfreelancer=bookfreeServ.getBookmarkedFreelancerById(id);
		return new ResponseEntity<>(bmarkfreelancer, HttpStatus.OK);
	}
	@DeleteMapping("/delBookmarkedFreelancer/{id}")
	public ResponseEntity<String>  deleteBookmarkedFreelancerById(@PathVariable long id) {
		String msg=bookfreeServ.deleteBookmarkedFreelancerById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK); 
	}
}
