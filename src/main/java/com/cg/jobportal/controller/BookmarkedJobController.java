package com.cg.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.jobportal.entity.BookmarkedJob;
import com.cg.jobportal.service.BookmarkedJobService;

@RestController
public class BookmarkedJobController {
	
	@Autowired
	public BookmarkedJobService bookJobServ;

	@PostMapping("/saveJob")
	public ResponseEntity<BookmarkedJob> saveJob(@RequestBody BookmarkedJob book){
		BookmarkedJob savedJob = bookJobServ.saveJob(book);
		return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllBookmarkedJob")
	public ResponseEntity<List<BookmarkedJob>> getAllBookmarkedJob(){
		List<BookmarkedJob> bookmark=bookJobServ.getAllBookmarkedJobs();
		return new ResponseEntity<List<BookmarkedJob>>(bookmark, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteBookmarkById/{id}")
	public ResponseEntity<String> deleteBookmarkById(@PathVariable Long id) {
		String delete = bookJobServ.deleteById(id);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}

	@GetMapping("/get/id/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id) {
			BookmarkedJob bookmarkedJob = bookJobServ.getById(id);
			return new ResponseEntity<>(bookmarkedJob, HttpStatus.OK);
	}
	
}
