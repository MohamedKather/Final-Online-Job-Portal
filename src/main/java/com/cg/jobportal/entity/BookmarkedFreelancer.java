package com.cg.jobportal.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class BookmarkedFreelancer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne(targetEntity=Skill.class, cascade=CascadeType.ALL)
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	@OneToOne(targetEntity=Freelancer.class, cascade=CascadeType.ALL)
	@JoinColumn(name="freelancer_id")
	private Freelancer freelancer;
	
	@ManyToOne(targetEntity=Recruiter.class, cascade=CascadeType.ALL)
	@JoinColumn(name="recruiter_id")
	private Recruiter bookmarkedBy;
	
	
	public BookmarkedFreelancer(Skill skill, Freelancer freelancer, Recruiter bookmarkedBy) {
		super();
		this.skill = skill;
		this.freelancer = freelancer;
		this.bookmarkedBy = bookmarkedBy;
	}
	public Recruiter getBookmarkedBy() {
		return bookmarkedBy;
	}
	public void setBookmarkedBy(Recruiter bookmarkedBy) {
		this.bookmarkedBy = bookmarkedBy;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	
}
 