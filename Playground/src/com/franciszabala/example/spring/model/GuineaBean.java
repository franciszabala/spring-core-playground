package com.franciszabala.example.spring.model;

public class GuineaBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void wakeFromSlumber() {
		System.out.println("Guinea Bean is waking from slumber");
	}

	public void diveInToSleep() {
		System.out.println("Guinea Bean is diving in to sleep");
	}
	
	
}
