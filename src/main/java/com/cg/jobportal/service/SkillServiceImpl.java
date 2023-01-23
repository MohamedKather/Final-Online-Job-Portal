package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.exceptions.SkillAlreadyExistsException;
import com.cg.jobportal.repository.SkillRepository;


@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepository;
	
	@Override

	public  Skill saveSkill(Skill skill) throws SkillAlreadyExistsException{
		if(skillRepository.existsById(skill.getSkillId())) {
			throw new SkillAlreadyExistsException();
		}
		return skillRepository.save(skill);
	}
	
	@Override
	public List<Skill> getAllSkills() {
        return skillRepository.findAll();
	}
	
	
	@Override
	public Skill getById(long skillId) throws InvalidSkillException {
		
		if(skillRepository.existsById(skillId)) {
			return skillRepository.findById(skillId).get();
		} else {
			throw new InvalidSkillException();
		}
	}
	
	@Override
	public String deleteSkill(long id) {
		skillRepository.deleteById(id);
		return "Deleted Successfully";
		
	}
	@Override
	public Skill updateSkill(long skillId, Skill skill) throws InvalidSkillException {
		if(skillRepository.existsById(skillId)) {
			return skillRepository.save(skill);
	} else{
		throw new InvalidSkillException();
	}
	}
}

	
	