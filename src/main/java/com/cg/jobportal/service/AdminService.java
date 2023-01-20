package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exceptions.AdminAlreadyExistException;
import com.cg.jobportal.exceptions.InvalidAdminException;

import jakarta.validation.Valid;

public interface AdminService {

	Admin saveAdmin(Admin ent) throws AdminAlreadyExistException;

	List<Admin> getAllAdmins();

	Admin updateAdmin(long admind, Admin ent);

	String loginadmin(Admin ad);

	Optional<Admin> getAdminById(Long adminId) throws InvalidAdminException;
}
