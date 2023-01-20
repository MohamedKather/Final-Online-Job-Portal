package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Feedback;
import com.cg.jobportal.repository.FeedbackRepository;
@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	FeedbackRepository feedrepo;

	@Override
	public Feedback addFeedback(Feedback feedback) {
		Feedback fb = feedrepo.save(feedback);
		return fb;
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		List<Feedback> list = feedrepo.findAll();
		return list;
	}

	@Override
	public Feedback updateFeedback(Feedback ent) {
		Feedback up = feedrepo.save(ent);
		return up;
	}

}
