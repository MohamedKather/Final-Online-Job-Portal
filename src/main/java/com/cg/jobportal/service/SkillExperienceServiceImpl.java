package com.cg.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.SkillExperience;
import com.cg.jobportal.exceptions.InvalidSkillExperienceException;
import com.cg.jobportal.exceptions.SkillExperienceAlreadyExistException;
import com.cg.jobportal.repository.SkillExperienceRepository;

@Service
public class SkillExperienceServiceImpl implements SkillExperienceService {
	@Autowired
	private SkillExperienceRepository skillExperienceRepository;

	@Override

	public SkillExperience addSkillExperience(SkillExperience skill) throws SkillExperienceAlreadyExistException {
		if (skillExperienceRepository.existsById(skill.getId())) {
			throw new SkillExperienceAlreadyExistException();
		}
		return skillExperienceRepository.save(skill);
	}

	@Override
	public SkillExperience getById(long id) throws InvalidSkillExperienceException {

		if (skillExperienceRepository.existsById(id)) {
			return skillExperienceRepository.findById(id).get();
		} else {
			throw new InvalidSkillExperienceException();
		}
	}

	@Override
	public String deleteSkillExperience(long id) {
		skillExperienceRepository.deleteById(id);
		return "Deleted Successfully";

	}

	@Override
	public SkillExperience updateSkillExperience(long id, SkillExperience skillExperience)
			throws InvalidSkillExperienceException {
		if (skillExperienceRepository.existsById(id)) {
			return skillExperienceRepository.save(skillExperience);
		} else {
			throw new InvalidSkillExperienceException();
		}
	}
}