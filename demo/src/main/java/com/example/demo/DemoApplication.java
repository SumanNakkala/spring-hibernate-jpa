package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Student;
import com.example.demo.entities.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepository strRepo;

	private Student findById;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		log.info("I am running inside the RUN");
		//findById = strRepo.findById(10001L);
		// Now trying to update the student;
		// With out Transactional - No EntityManager with actual transaction available for current thread - cannot reliably process 'merge' call
		//strRepo.updateStudent(10001L);
		//System.out.println("Student name {} " + findById.getName());
		strRepo.findById(10001L);
		strRepo.findPassportDetails(10001L);
		
		
	}

}
