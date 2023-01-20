package com.cg.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exceptions.AdminAlreadyExistException;
import com.cg.jobportal.exceptions.InvalidAdminException;
import com.cg.jobportal.service.AdminService;


@RestController
public class AdminController {

	@Autowired
	private AdminService serv;
	@PostMapping("/loginAdmin")
	public ResponseEntity<String> loginAdmin(@RequestBody Admin ad){
		String s=serv.loginadmin(ad);
		return new ResponseEntity<>(s,HttpStatus.OK);
	}

	@PostMapping("/saveAdmin")
	public ResponseEntity<Admin> saveAdmin(Admin ent)throws AdminAlreadyExistException{
		Admin savedad=serv.saveAdmin(ent);
		return new ResponseEntity<Admin>(savedad,HttpStatus.CREATED);
		
	}
	@GetMapping("/getAllAdmin")
	public ResponseEntity<List<Admin>> getAllAdmins(){
		List<Admin> Admins=serv.getAllAdmins();
		return new ResponseEntity<List<Admin>>(Admins, HttpStatus.OK);
	}
	
	@GetMapping("/getAdmin/{adminId}")
	public ResponseEntity<Optional<Admin>> getAdminById(@PathVariable long adminId) throws InvalidAdminException{
		Optional<Admin> std=serv.getAdminById(adminId);
		return new ResponseEntity<>(std, HttpStatus.OK);
		
	}
	
	@PutMapping("/updateAdmin/{adminId}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable int adminId, @RequestBody Admin ent){
		Admin update=serv.updateAdmin(adminId,ent);
		return new ResponseEntity<Admin>(update, HttpStatus.ACCEPTED);
		
	}
}
