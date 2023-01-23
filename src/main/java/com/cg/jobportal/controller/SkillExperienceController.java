package com.cg.jobportal.controller;

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

import com.cg.jobportal.entity.SkillExperience;
import com.cg.jobportal.exceptions.InvalidSkillExperienceException;
import com.cg.jobportal.exceptions.SkillExperienceAlreadyExistException;
import com.cg.jobportal.service.SkillExperienceService;

/**********************************************************************************
 * @author sangeetha Created Date: 23 January, 2023 Description: This class is
 *         the controller for the SkillExperience module
 **********************************************************************************/
@RequestMapping("/skillExperience")
@RestController
public class SkillExperienceController {

	@Autowired
	private SkillExperienceService skillExperienceService;

	/******************************************************************************
	 * @param skillexperience
	 * @return: Response Entity of object type
	 * @throws SkillExperienceAlreadyExistException 
	 * @postmapping: Post mapping requests a body from the user which is then
	 *               persisted onto the database.
	 *****************************************************************************/
	@PostMapping("/add")
	public ResponseEntity<SkillExperience> addSkillExperience(@RequestBody SkillExperience skillexperience)throws SkillExperienceAlreadyExistException {

		SkillExperience experience = skillExperienceService.addSkillExperience(skillexperience);
		return new ResponseEntity<>(experience, HttpStatus.OK);
	}

	/********************************************************************************
	 * @param id
	 * @return: Response Entity of object type
	 * @throws InvalidSkillExperienceException
	 * @GetMapping: Get mapping expects a PathVariable to be passed which is then
	 *              used to return the entity object that is fetched from the
	 *              database.
	 *********************************************************************************/
	@GetMapping("/getExperience/{id}")
	public ResponseEntity<SkillExperience> getById(@PathVariable long id) throws InvalidSkillExperienceException {
		SkillExperience getId=skillExperienceService.getById(id);
		return new ResponseEntity<>(getId, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteSkillExperienceById(@PathVariable long id) throws InvalidSkillExperienceException {
		String message=skillExperienceService.deleteSkillExperience(id);
		return new ResponseEntity<>(message,HttpStatus.GONE);
	}

	@PutMapping("/{id}")
	public SkillExperience updateSkillExperience(@PathVariable long id,@RequestBody SkillExperience skillExperience) throws InvalidSkillExperienceException {
		
		return skillExperienceService.updateSkillExperience(id,skillExperience);
	}

}
