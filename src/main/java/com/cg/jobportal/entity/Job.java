package com.cg.jobportal.entity;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {

	@Id
	@Column(name = "job_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String jobTitle;
	@Column(nullable = false)
	private String jobDescription;
	@Column(nullable = false)
	private Boolean active;
	
	@OneToOne(targetEntity = Skill.class, cascade = CascadeType.ALL)
	private Skill skill;

	@ManyToOne(targetEntity = Recruiter.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "recruiter_id")
	private Recruiter postedBy;

	private LocalDate postedDate = LocalDate.now(ZoneId.of("GMT+05:30"));

	@OneToOne(targetEntity = Freelancer.class, cascade =CascadeType.ALL)
	private Freelancer awardedTo;

	@OneToMany(mappedBy = "job", targetEntity = JobApplication.class, cascade =CascadeType.ALL)
	private List<JobApplication> jobApplications;
}
