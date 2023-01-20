package com.cg.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	public List<Admin> getByEmail(@Param("email") String email);

	public List<Admin> getByPassword(@Param("password") String password);

	public Admin findByUserName(String userName);

	public boolean existsByUserName(String userName);

}
