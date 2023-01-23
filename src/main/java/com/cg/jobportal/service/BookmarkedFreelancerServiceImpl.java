package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.BookmarkedFreelancer;
import com.cg.jobportal.exceptions.BookmarkedFreelancerAlreadyExistsException;
import com.cg.jobportal.exceptions.InvalidBookmarkedFreelancerException;
import com.cg.jobportal.repository.BookmarkedFreelancerRepository;



@Service
public class BookmarkedFreelancerServiceImpl implements BookmarkedFreelancerService {

	@Autowired
	private BookmarkedFreelancerRepository bookmarkedFreelancerRepository;
	
	@Override
	public  BookmarkedFreelancer saveBookmarkedFreelancer(BookmarkedFreelancer bmark) throws BookmarkedFreelancerAlreadyExistsException{
		if(bookmarkedFreelancerRepository.existsById(bmark.getId()))
			throw new BookmarkedFreelancerAlreadyExistsException();
		
		return bookmarkedFreelancerRepository.save(bmark);
	}
	
	@Override
	public List<BookmarkedFreelancer> getAllBookmarkedFreelancer(){
		return bookmarkedFreelancerRepository.findAll();
	}
	
	@Override
	public BookmarkedFreelancer getBookmarkedFreelancerById(long id) throws InvalidBookmarkedFreelancerException{
		if(bookmarkedFreelancerRepository.existsById(id)) {
			return bookmarkedFreelancerRepository.findById(id).get();
		}
		else
			throw new InvalidBookmarkedFreelancerException();
	}
	@Override
	public String deleteBookmarkedFreelancerById(long id) {
		Optional<BookmarkedFreelancer> free=bookmarkedFreelancerRepository.findById(id);
		if(free.isPresent()) {
			bookmarkedFreelancerRepository.deleteById(id);
			return "deleted successfully";
		}
		return "id doesn't exist";
	}
}
