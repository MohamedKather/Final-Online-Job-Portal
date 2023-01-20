package com.cg.jobportal.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BookmarkedJob {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(targetEntity = Skill.class, cascade =CascadeType.ALL)
	@JoinColumn(name = "skill_id")
	private Skill skill;

	@ManyToOne(targetEntity = Job.class, cascade =CascadeType.ALL)
	@JoinColumn(name = "job_id")
	private Job job;

	@OneToOne(targetEntity = Freelancer.class, cascade =CascadeType.ALL)
	@JoinColumn(name = "freelancer_id")
	private Freelancer freelancer;

	public BookmarkedJob(Skill skill, Job job, Freelancer freelancer) {
		super();
		this.skill = skill;
		this.job = job;
		this.freelancer = freelancer;
	}
	
	
	
}