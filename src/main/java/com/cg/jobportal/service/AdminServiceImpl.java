package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exceptions.AdminAlreadyExistException;
import com.cg.jobportal.exceptions.InvalidAdminException;
import com.cg.jobportal.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) throws AdminAlreadyExistException {
		if (!adminRepository.existsByUserName(admin.getUserName())) {
			return adminRepository.save(admin);
		} else {
			throw new AdminAlreadyExistException();
		}
	}

	@Override
	public List<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(long adminId) throws InvalidAdminException {

		if (adminRepository.existsById(adminId)) {
			return adminRepository.findById(adminId).get();

		} else {
			throw new InvalidAdminException();
		}
	}

	@Override
	public Admin updateAdmin(long adminId, Admin admin) throws InvalidAdminException {
		if (adminRepository.existsById(adminId)) {
			return adminRepository.save(admin);
		} else {
			throw new InvalidAdminException();
		}

	}

	@Override
	public String loginAdmin(Admin admin) {
		Optional<Admin> login = adminRepository.findById(admin.getAdminId());
		
			if ((login.isPresent())&&(login.get().getPassword().equals(admin.getPassword()))) {
				return "Login Successfull";
			}
		return "Invalid email or password";

	}
}
