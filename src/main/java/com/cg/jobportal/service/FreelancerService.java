package com.cg.jobportal.service;
import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Freelancer;

import jakarta.validation.Valid;

public interface FreelancerService {

	Freelancer saveFreelancer(Freelancer free);

	List<Freelancer> getAllFreelancer();

	Optional<Freelancer> getFreelancerById(long id);

	String deleteFreelancer(long id);

	Freelancer updateFreelancer(Freelancer free);

	List<Freelancer> FreelancerByUserName(String userName);

	
}
