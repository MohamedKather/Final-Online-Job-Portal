package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Recruiter;

public interface RecruiterService {
	
	Recruiter saveRecruiter(Recruiter rec);
	
	List<Recruiter> getAllRecruiters();
	
	Optional<Recruiter>getRecruiterById(Long Id);
	
	String deleteById(Long id);
	
	Recruiter updateRecruiter(Recruiter rec);

}
