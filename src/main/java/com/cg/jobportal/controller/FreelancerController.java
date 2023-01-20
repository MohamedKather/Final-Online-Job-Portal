package com.cg.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Freelancer;
import com.cg.jobportal.service.FreelancerService;
@RestController
public class FreelancerController {

	@Autowired
	FreelancerService fserv;
	
	@PostMapping("/saveFreelancer")
	 public String saveFreelancer(@RequestBody Freelancer free)  {
		Freelancer saved = fserv.saveFreelancer(free);
		return "saved successfully";
		 
	 }
	 @GetMapping("/allFreelancer")
	 public ResponseEntity<List<Freelancer>> getAllFreelancer() {
		List<Freelancer> getall=fserv.getAllFreelancer();
		return new ResponseEntity<List<Freelancer>>(getall, HttpStatus.OK);
		 
	 }
	 
	 @GetMapping("/getFreelancer/{id}")
	 public ResponseEntity<List<Freelancer>> getFreelancerId(@PathVariable long id){
		Optional<Freelancer> free=fserv.getFreelancerById(id);
		 return new ResponseEntity(free, HttpStatus.OK);
		 
	 }

	 
	 @DeleteMapping("/deleteFreelancer")
	 public String deleteFreelancer(@RequestParam long id) {
		 fserv.deleteFreelancer(id);
		 return "Freelancer deleted successfully";

	 }
	 
	 
	 @PutMapping("/updateFreelancer")
	 public Freelancer updateStudent(@RequestBody Freelancer free) {
		 return fserv.updateFreelancer(free);
	 }
	 
	 @GetMapping("/Freelancer/{userName}")
	 public List<Freelancer> getFreelancerByFirstName(@PathVariable String userName){
		 List<Freelancer> list = fserv.FreelancerByUserName(userName);
		 return list;
	 }
}
