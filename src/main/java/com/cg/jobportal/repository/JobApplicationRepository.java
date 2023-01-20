package com.cg.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.JobApplication;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long>{

	//List<JobApplication> findByFreeLancerid(@Param("fr_id")long freelancerId);

	//List<JobApplication> findAllByJobId(@Param("job_id")long jobId);


}
