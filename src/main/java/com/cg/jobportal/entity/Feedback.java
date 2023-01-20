package com.cg.jobportal.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor

public class Feedback  {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Integer ranges;
	String comments;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "recruiter_id")
	Recruiter createdBy;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "freelancer_id")
	Freelancer createdFor;

	public Feedback(Integer ranges, String comments, Recruiter createdBy, Freelancer createdFor) {
		super();
		this.ranges = ranges;
		this.comments = comments;
		this.createdBy = createdBy;
		this.createdFor = createdFor;
	}

	
}
