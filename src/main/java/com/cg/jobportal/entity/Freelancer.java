package com.cg.jobportal.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Freelancer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "freelancer_id", updatable = false)
	private long id;

	private String userName;
	private String firstName;
	private String lastName;
	private String passowrd;

	@OneToMany(targetEntity = JobApplication.class)
	private List<JobApplication> appliedJobs;

	@OneToMany(mappedBy = "createdFor", targetEntity = Feedback.class, cascade = CascadeType.ALL)
	private List<Feedback> feedbacks;

	@OneToMany(mappedBy = "freelancer", targetEntity = SkillExperience.class, cascade = CascadeType.ALL)
	private List<SkillExperience> skills;

	@OneToMany(mappedBy = "freelancer", targetEntity = BookmarkedJob.class, cascade = CascadeType.ALL)
	private List<BookmarkedJob> bookmarkedJobs;

	public Freelancer(String userName, String firstName, String lastName, String passowrd,
			List<JobApplication> appliedJobs, List<Feedback> feedbacks, List<SkillExperience> skills,
			List<BookmarkedJob> bookmarkedJobs) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passowrd = passowrd;
		this.appliedJobs = appliedJobs;
		this.feedbacks = feedbacks;
		this.skills = skills;
		this.bookmarkedJobs = bookmarkedJobs;
	}

}
