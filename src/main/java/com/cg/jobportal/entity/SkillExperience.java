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
public class SkillExperience {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 private int years;
	 
	 @OneToOne(cascade = CascadeType.ALL)
		private Skill skill;

		@ManyToOne(targetEntity = Freelancer.class,cascade= CascadeType.ALL)
		@JoinColumn(name = "freelancer_id")
		private Freelancer freelancer;

		public SkillExperience(int years, Skill skill, Freelancer freelancer) {
			super();
			this.years = years;
			this.skill = skill;
			this.freelancer = freelancer;
		}
	 
	
}
