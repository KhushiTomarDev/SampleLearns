package com.example.Demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee99 {
    @Id
    @GeneratedValue
    private Long id;
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getId() {
		return id;
	}
	
	
	public Employee99(String name, String location) {
		super();
		
		this.name = name;
		this.location = location;
	}
	public Employee99() {
		super();
	}
	

}
