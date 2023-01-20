package com.cg.jobportal.service;

import java.util.List;

import com.cg.jobportal.entity.Feedback;

public interface FeedbackService {

	Feedback addFeedback(Feedback feedback);

	List<Feedback> getAllFeedbacks();

	Feedback updateFeedback(Feedback ent);


}
