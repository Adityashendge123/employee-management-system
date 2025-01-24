package com.data.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String designation;
    private LocalDate joiningDate;
    private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long id, String name, String designation, LocalDate joiningDate, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    
    
}
