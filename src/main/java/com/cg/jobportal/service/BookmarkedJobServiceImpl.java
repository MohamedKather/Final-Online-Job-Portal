package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.BookmarkedJob;
import com.cg.jobportal.exceptions.BookmarkedJobAlreadyExistException;
import com.cg.jobportal.repository.BookmarkedJobRepository;

@Service
public class BookmarkedJobServiceImpl implements BookmarkedJobService{
	
	@Autowired
	private BookmarkedJobRepository bookmarkedjobService;
	
	@Override
	public BookmarkedJob saveJob(BookmarkedJob bookmarkedjob) throws BookmarkedJobAlreadyExistException {
		if(bookmarkedjobService.existsById(bookmarkedjob.getId()))
			throw new BookmarkedJobAlreadyExistException();
	return bookmarkedjobService.save(bookmarkedjob);
	}

	@Override
	public List<BookmarkedJob> getAllBookmarkedJobs() {
		return bookmarkedjobService.findAll();
	}
	
	@Override
	public String deleteById(long id) {
		bookmarkedjobService.deleteById(id);
		return "Bookmark deleted successfully";
	}

	@Override
	public BookmarkedJob getById(long id) {
		return bookmarkedjobService.findById(id).get();
		 
	}
}
