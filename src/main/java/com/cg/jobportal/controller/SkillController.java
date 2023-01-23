package com.cg.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Skill;

import com.cg.jobportal.exceptions.InvalidSkillException;
import com.cg.jobportal.exceptions.SkillAlreadyExistsException;
import com.cg.jobportal.service.SkillService;



/**********************************************************************
 * @author sangeetha Created Date: 23 January, 2023 Description: This class is
 *         the controller for the Recruiter module
 **********************************************************************/
@RequestMapping("/skill")
@RestController
public class SkillController {

	@Autowired
	private SkillService skillService;

	/*************************************************************
	 * @param skill
	 * @return: Response Entity of Object type
	 * @throws InvalidSkillException
	 * @postmapping: Post mapping requests a body from the user which is then
	 *               persisted onto the database.
	 *************************************************************/

	@PostMapping("/save")
	public ResponseEntity<Skill> saveSkill(Skill skill) throws SkillAlreadyExistsException {
		Skill save = skillService.saveSkill(skill);
		return new ResponseEntity<>(save, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Skill>> getAllSkills() {
		List<Skill> skill = skillService.getAllSkills();
		return new ResponseEntity<>(skill, HttpStatus.OK);
	}

	@GetMapping("/{skillId}")
	public ResponseEntity<Skill> getSkillById(@PathVariable long skillId) throws InvalidSkillException {
		Skill skill = skillService.getById(skillId);
		return new ResponseEntity<>(skill, HttpStatus.OK);
	}

	/*****************************************************************************
	 * @param id
	 * @return: Response Entity of Object type
	 * @throws InvalidSkillException
	 * @DeleteMapping: Delete mapping expects a PathVariable to be passed which is
	 *                 used to delete the object from the database.
	 ****************************************************************************/
	@DeleteMapping("/deleteSkill/{id}")
	public ResponseEntity<String> deleteSkillById(@PathVariable long skillId){
		String message=skillService.deleteSkill(skillId);
		return new ResponseEntity<>(message, HttpStatus.GONE);
	}

	/***********************************************************************
	 * @param skill
	 * @return Response Entity of Object type
	 * @throws InvalidSkillException Description : This method updates the existing
	 *                               skill Application.
	 * @putmapping: Put mapping requests a body from the user which is then
	 *              persisted onto the database.
	 ***********************************************************************/
	@PutMapping("/{id}")
	public Skill updateSkill(@PathVariable long skillId, @RequestBody Skill skill) throws InvalidSkillException {
		return skillService.updateSkill(skillId,skill);

	}
}
