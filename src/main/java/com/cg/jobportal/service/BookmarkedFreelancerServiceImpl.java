package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.BookmarkedFreelancer;
import com.cg.jobportal.exceptions.BookmarkedFreelancerAlreadyExistsException;
import com.cg.jobportal.exceptions.NoBookmarkedFreelancerExistsException;
import com.cg.jobportal.repository.BookmarkedFreelancerRepository;



@Service
public class BookmarkedFreelancerServiceImpl implements BookmarkedFreelancerService {

	@Autowired
	private BookmarkedFreelancerRepository bookRepo;
	
	@Override
	public  BookmarkedFreelancer saveBookmarkedFreelancer(BookmarkedFreelancer bmark) throws BookmarkedFreelancerAlreadyExistsException{
		if(bookRepo.existsById(bmark.getId()))
			throw new BookmarkedFreelancerAlreadyExistsException();
		
		BookmarkedFreelancer savedBookmarkedFreelancer= bookRepo.save(bmark);
		return savedBookmarkedFreelancer;
	}
	
	@Override
	public List<BookmarkedFreelancer> getAllBookmarkedFreelancer(){
		List<BookmarkedFreelancer>  bmarkfreelancer=bookRepo.findAll();
		return  bmarkfreelancer;
	}
	
	@Override
	public Optional<BookmarkedFreelancer> getBookmarkedFreelancerById(long id) throws NoBookmarkedFreelancerExistsException{
		if(bookRepo.existsById(id)==false)
			throw new NoBookmarkedFreelancerExistsException();
		Optional<BookmarkedFreelancer> book=bookRepo.findById(id);
		return book;
	}
	@Override
	public String deleteBookmarkedFreelancerById(long id) {
		Optional<BookmarkedFreelancer> free=bookRepo.findById(id);
		if(free.isPresent()) {
			bookRepo.deleteById(id);
			return "deleted successfully";
		}
		return "id doesn't exist";
	}
}
