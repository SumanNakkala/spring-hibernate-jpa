package com.example.demo.entities;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
	EntityManager em;
	
	
	public Student findById(long id)
	{
		return em.find(Student.class, id);
	}
	
	public void updateStudent(long id)
	{
		Student s = em.find(Student.class, id);
		s.setName("Suman Nakkala");
		em.merge(s);
	}
	
	public void findPassportDetails(long id)
	{
		Student s = em.find(Student.class, id);
		System.out.println("The PASSPORT DETAILS  - > " + s.getPassport().getNumber());
	}
}
