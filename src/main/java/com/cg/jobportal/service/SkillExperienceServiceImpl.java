package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.SkillExperience;
import com.cg.jobportal.repository.SkillExperienceRepository;
@Service
public class SkillExperienceServiceImpl implements SkillExperienceService{
	@Autowired
	private SkillExperienceRepository skillExRepo;

	@Override
	public SkillExperience addSkill(SkillExperience skillexperience) {
		SkillExperience saveex=skillExRepo.save(skillexperience);
		return saveex;
	}

	@Override
	public List<SkillExperience> getAllId(Long id) {
		List<SkillExperience> list = skillExRepo.findAll();
		return list;
	}
	

}