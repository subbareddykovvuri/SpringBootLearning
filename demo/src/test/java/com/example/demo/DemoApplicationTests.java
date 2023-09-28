package com.example.demo;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Student;
import com.example.demo.repo.StudentRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Test
	void contextLoads() {
		Student s=new Student();
		s.setId(1);
		s.setName("subba");
		s.setTestscore(80);
		
		studentRepo.save(s);
		
		Student s1= studentRepo.findById(1).get();
		assertNotNull(s1);
		
		s.setName("Reddy");
		studentRepo.save(s);
		
		studentRepo.deleteById(1);
	}

}
