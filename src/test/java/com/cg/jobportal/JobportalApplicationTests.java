/*package com.cg.jobportal;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.jobportal.entity.Freelancer;
import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.service.BookmarkedFreelancerService;
import com.cg.jobportal.service.FreelancerService;
import com.cg.jobportal.service.RecruiterService;
import com.cg.jobportal.service.SkillService;


@SpringBootTest
class JobportalApplicationTests {
=======
import static org.mockito.ArgumentMatchers.any;import static org.mockito.Mockito.when; 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exceptions.AdminAlreadyExistException;
import com.cg.jobportal.repository.AdminRepository;
import com.cg.jobportal.service.AdminServiceImpl;
import com.womenempowerment.entity.Scheme;
import com.womenempowerment.exception.SchemeAlreadyExistsException;
import com.womenempowerment.exception.SchemeNotPresentException;
import com.womenempowerment.repository.SchemeRepository;import com.womenempowerment.service.SchemeServiceImpl; 

@ExtendWith(MockitoExtension.class)
public class AdminServiceTest {
	 
	@InjectMocksprivate
	AdminServiceImpl schemeServiceImpl; 
	@Mockprivate
	AdminRepository schemeRepository; 
>>>>>>> 89df81da66a85d8d23f0ab63a4aee050f97f6eca

	@Autowired
	SkillService skillService;

	@Autowired
	RecruiterService recruiterService;

	@Autowired
	FreelancerService freelancerService;

//	@Test
//	void testAddSkill() {
//		Skill skill = new Skill(1,"java", "Coding") ;
//		skillService..save(skill);
//		long id = skillService.getCurrentId();
//		assertEquals("java skill", skillService.findById(id).getDescription());
//	}

	@Test
<<<<<<< HEAD
	void testAddRecruiter() {
		Recruiter recruiter = new Recruiter(1,"John", "Doe","password123","JohnDoe");
		recruiterService.saveRecruiter(recruiter);
		Recruiter id = recruiterService.getRecruiterById(recruiter.getId());
		assertEquals("Doe", recruiterService.getRecruiterById(recruiter.getId()).getLastName());
	}

	@Test
	void testAddFreelancer() {
		Freelancer freelancer = new Freelancer(1, "John", "Doe", "JohnDoe","password123");
		freelancerService.saveFreelancer(freelancer);
		Freelancer id = freelancerService.getFreelancerById(freelancer.getId());
		assertEquals("password123", freelancerService.getFreelancerById(freelancer.getId()).getPassword());
	}
=======
	public void saveAdmin_exception() throws AdminAlreadyExistException {
		 Admin Admins = new Admin(3, "asdf",  "bvf", "hhjh","abc@gmail","abc123");
		when(AdminRepository.((long) 3)).thenReturn(true);
		Assertions.assertThrows(AdminAlreadyExistsException.class, () -> AdminServiceImpl.addAdmin(Admins));
		 }
	
	 @Test
	public void saveScheme_success() throws SchemeAlreadyExistsException { 
		Scheme schemes = new Scheme(3, "asdf", 2022, "bvf", "hhjh");
	when(schemeRepository.save(any())).thenReturn(schemes);
	Scheme saveSchemes = schemeServiceImpl.addScheme(schemes);
	Assertions.assertEquals(3, saveSchemes.getSchemeId()); 
	} 
>>>>>>> 89df81da66a85d8d23f0ab63a4aee050f97f6eca

	@Test
	public void updateScheme_success() throws SchemeNotPresentException {
		Scheme s = new Scheme(2, "yukjj", 2022, "geh", "eyuu");
	when(schemeRepository.existsById((long) 2)).thenReturn(true);
	when(schemeRepository.save(any())).thenReturn(s);
	Scheme sch = schemeServiceImpl.updateScheme(s);
	Assertions.assertEquals(2, sch.getSchemeId());
	} 

	@Test
	public void updateScheme_exception() throws SchemeNotPresentException {
		Scheme s = new Scheme(2, "yukjj", 2022, "geh", "eyuu");
		when(schemeRepository.existsById((long) 2)).thenReturn(false); 
		Assertions.assertThrows(SchemeNotPresentException.class, () -> schemeServiceImpl.updateScheme(s));}
}*/
