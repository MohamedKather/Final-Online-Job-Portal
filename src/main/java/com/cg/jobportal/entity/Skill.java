package com.cg.jobportal.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/****************************************************************
 * 
 * @author sangeetha
 * Created Date: 23 January, 2023 
 * Description : This is the Entity class for Skill module.
 *
 ****************************************************************/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long skillId;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String usereName;
	@Column (nullable = false)
	private String description;
	@Column (nullable = false)
	private String freelancer;
	
	
	}

