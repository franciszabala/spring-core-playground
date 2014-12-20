package com.franciszabala.example.spring.model;

import com.franciszabala.example.spring.aspect.Loggable;

public class Employee {

	private String name;
	private String empId;
	private String firstName;
	private String lastName;
	
	private Address address;
	
	public String getEmpId() {
		return empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void getMessage() {
		System.out.println("Employee message");
	}

	
	public void initMethod() {
		System.out.println("The employee is now working");
	}

	public void destroyMethod() {
		System.out.println("The employee has stopped working");
	}
	
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name = nm;
	}

	public void throwException() {
		throw new RuntimeException("Dummy Exception");
	}

}
