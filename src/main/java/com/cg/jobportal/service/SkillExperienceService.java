package com.cg.jobportal.service;

import com.cg.jobportal.entity.SkillExperience;
import com.cg.jobportal.exceptions.InvalidSkillExperienceException;
import com.cg.jobportal.exceptions.SkillExperienceAlreadyExistException;

public interface SkillExperienceService {

	SkillExperience addSkillExperience(SkillExperience skillexperience) throws SkillExperienceAlreadyExistException;

	SkillExperience getById(long id);

	String deleteSkillExperience(long id);

	SkillExperience updateSkillExperience(long id, SkillExperience skillExperience) throws InvalidSkillExperienceException;

}
