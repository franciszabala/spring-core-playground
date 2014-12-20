package com.franciszabala.example.spring.model;

import org.springframework.beans.factory.BeanNameAware;

public class Address implements BeanNameAware {
	private String streetAddress;
	private String city;
	private String province;
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public void initMethod() {
		System.out.println("Creating address!");
	}

	public void destroyMethod() {
		System.out.println("Destroying address");
	}
	
	public void getMessage() {
		System.out.println("Address message");
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
	}


}
