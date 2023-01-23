package com.cg.jobportal.service;

import java.util.List;

import com.cg.jobportal.entity.BookmarkedJob;
import com.cg.jobportal.exceptions.BookmarkedJobAlreadyExistException;

public interface BookmarkedJobService {

	BookmarkedJob saveJob(BookmarkedJob book) throws BookmarkedJobAlreadyExistException;

	List<BookmarkedJob> getAllBookmarkedJobs();

	String deleteById(long id);

	BookmarkedJob getById(long id);

}
