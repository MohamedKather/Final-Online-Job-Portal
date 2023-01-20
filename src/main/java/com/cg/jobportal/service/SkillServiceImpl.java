package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.repository.SkillRepository;


@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepo;
	
	@Override
	public  Skill saveSkill(Skill skl) throws InvalidSkillException{
		if(skillRepo.existsById(skl.getId()))
			throw new InvalidSkillException();
		
		Skill savedSkill= skillRepo.save(skl);
		return savedSkill;
	}
	
	@Override
	public List<Skill> getAllSkills() {
        List<Skill> skills = skillRepo.findAll();
		return skills;
	}
	
	
	@Override
	public Optional<Skill> getSkillById(long id) {
		Optional<Skill> skill=skillRepo.findById(id);
		return skill;
	}
	
	@Override
	public String deleteSkill(long id) {
		skillRepo.deleteById(id);
		return "Deleted Successfully";
		
	}
	@Override
	public Skill updateSkill(Skill skill) {
		Skill skills=skillRepo.save(skill);
		return skills;
	}
}

	
	