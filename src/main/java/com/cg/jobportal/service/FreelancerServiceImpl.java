package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Freelancer;
import com.cg.jobportal.repository.FreelancerRepository;

@Service
public class FreelancerServiceImpl implements FreelancerService {
    
	@Autowired
	FreelancerRepository frepo;

	@Override
	public Freelancer saveFreelancer(Freelancer free) {
		Freelancer saved = frepo.save(free);
		return saved;
	}

	@Override
	public List<Freelancer> getAllFreelancer() {
		List<Freelancer> list = frepo.findAll();
		return list;
	}

	@Override
	public Optional<Freelancer> getFreelancerById(long id) {
		Optional<Freelancer> getId = frepo.findById(id);
		return getId;
	}

	@Override
	public String deleteFreelancer(long id) {
		Optional<Freelancer> getId = frepo.findById(id);
		if(getId.isPresent()) {
			frepo.deleteById(id);
		}
		return "Freelancer Doesn't Exists";
	}

	@Override
	public Freelancer updateFreelancer(Freelancer free) {
		Freelancer update = frepo.save(free);
		return update;
	}

	@Override
	public List<Freelancer> FreelancerByUserName(String userName) {
		List<Freelancer> getName = frepo.findByUserName(userName);
		return getName;
	}
	
	
}
