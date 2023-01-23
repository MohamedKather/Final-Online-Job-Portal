package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.exceptions.InvalidRecruiterException;
import com.cg.jobportal.exceptions.RecruiterAlreadyExistException;
import com.cg.jobportal.repository.RecruiterRepository;

@Service
public class RecruiterServiceImpl implements RecruiterService {

	@Autowired
	private RecruiterRepository recruiterRepository;

	@Override
	public Recruiter saveRecruiter(Recruiter recruiter) throws RecruiterAlreadyExistException {
		if (recruiterRepository.existsById(recruiter.getId()))
			throw new RecruiterAlreadyExistException();
		return recruiterRepository.save(recruiter);
	}

	@Override
	public List<Recruiter> getAllRecruiter() {
		return recruiterRepository.findAll();
	}

	@Override
	public Recruiter getRecruiterById(long id) throws InvalidRecruiterException {
		if (recruiterRepository.existsById(id)) {
			return recruiterRepository.findById(id).get();
		} else {
			throw new InvalidRecruiterException();
		}
	}

	@Override
	public String deleteById(long id) {
		if (recruiterRepository.existsById(id)) {
			recruiterRepository.deleteById(id);
			return "Recruiter data deleted successfully";
		}
		return "recruter id doesn't exist";
	}

	@Override
	public Recruiter updateRecruiter(long id, Recruiter recruiter) throws InvalidRecruiterException {
		if (recruiterRepository.existsById(id)) {
			return recruiterRepository.save(recruiter);
		} else {
			throw new InvalidRecruiterException();
		}
	}

	@Override
	public String loginRecruiter(Recruiter recruiter) {
		Optional<Recruiter> login = recruiterRepository.findById(recruiter.getId());

		if ((login.isPresent()) && (login.get().getPassword().equals(recruiter.getPassword()))) {
			return "Login Successfull";
		}
		return "Invalid email or password";

	}
}
