package com.cg.jobportal.service;

import java.util.List;
import com.cg.jobportal.entity.SkillExperience;

public interface SkillExperienceService {

	SkillExperience addSkill(SkillExperience skillexperience);

	List<SkillExperience> getAllId(Long id);

}
	


