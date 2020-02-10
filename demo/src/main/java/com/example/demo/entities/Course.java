package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@ManyToOne
	private Student student;
	
	protected Course(){
		
	}
	
	Course(String name){
		
		this.name = name;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
