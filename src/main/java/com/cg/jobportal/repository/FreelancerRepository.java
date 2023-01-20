package com.cg.jobportal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.Freelancer;


@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {
    
	public List<Freelancer> findByUserName(@Param("name")String userName);

	
	public void deleteById(int id);


	
}
