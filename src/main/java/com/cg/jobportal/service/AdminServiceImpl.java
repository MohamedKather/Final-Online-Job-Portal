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
	AdminRepository repo;

	@Override
	public Admin saveAdmin(Admin ent) throws AdminAlreadyExistException {
		if (repo.existsById(ent.getAdminId())) {
			throw new AdminAlreadyExistException();
		}
		Admin ad = repo.save(ent);
		return ad;
	}

	@Override
	public List<Admin> getAllAdmins() {
		List<Admin> list = repo.findAll();
		return list;
	}

	@Override
	public Optional<Admin> getAdminById(Long adminId) throws InvalidAdminException {
		if (repo.findById(adminId) != null) {
			Optional<Admin> finding = repo.findById(adminId);
			return finding;
		} else {
			throw new InvalidAdminException();
		}
	}

	@Override
	public Admin updateAdmin(long adminId, Admin ent) {
		if (!(repo.existsById(ent.getAdminId()))) {
			System.out.println("Admin Doesn't Exist");
		}
		Admin ad = repo.save(ent);
		return ad;
	}

	@Override
	public String loginadmin(Admin ad) {
		List<Admin> a = repo.getByEmail(ad.getEmail());
		List<Admin> b = repo.getByPassword(ad.getPassword());
		if (a.equals(ad.getEmail()) && b.equals(ad.getPassword())) {
			return "Login Successfull";
		}
		return "Invalid email or password";
	}
}
