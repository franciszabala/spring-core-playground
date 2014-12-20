package com.franciszabala.example.spring.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitGuineaBean implements BeanPostProcessor{
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void initMethod() {
		System.out.println("Init Guinea Bean is begrudginly waking up");
	}

	public void diveInToSleep() {
		System.out.println("Init Guinea Bean is lumbering back to bed");
	}
	
	public Object postProcessBeforeInitialization(Object bean,
            String beanName) throws BeansException {
			System.out.println("Starting up : " + beanName);
			return bean;  // you can return any other object as well
}

	public Object postProcessAfterInitialization(Object bean,
            String beanName) throws BeansException {
		System.out.println("After init : " + beanName);
		return bean;  // you can return any other object as well
	}
	
}
