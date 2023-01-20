package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.BookmarkedFreelancer;
import com.cg.jobportal.exceptions.BookmarkedFreelancerAlreadyExistsException;
import com.cg.jobportal.exceptions.NoBookmarkedFreelancerExistsException;

public interface BookmarkedFreelancerService {

	BookmarkedFreelancer saveBookmarkedFreelancer(BookmarkedFreelancer bmark)
			throws BookmarkedFreelancerAlreadyExistsException;

	List<BookmarkedFreelancer> getAllBookmarkedFreelancer();

	Optional<BookmarkedFreelancer> getBookmarkedFreelancerById(long id) throws NoBookmarkedFreelancerExistsException;

	String deleteBookmarkedFreelancerById(long id);

}
