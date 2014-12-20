package com.franciszabala.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.franciszabala.example.spring.model.Address;
import com.franciszabala.example.spring.model.Employee;

public class SpringBeanInitTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ClassPathXmlApplicationContext ctx = new
		// ClassPathXmlApplicationContext("spring.xml");
		// EmployeeService employeeService = ctx.getBean("employeeService",
		// EmployeeService.class);
		//
		// System.out.println(employeeService.getEmployee().getName());
		//
		// employeeService.getEmployee().setName("Pankaj");
		//
		// employeeService.getEmployee().throwException();
		//
		// ctx.close();
		/*
		 * XmlBeanFactory factory = new XmlBeanFactory (new
		 * ClassPathResource("lazyloading.xml"));
		 */
		// Employee empOld = (Employee) factory.getBean("employee");
		// empOld.getMessage();
		//
		//
		// Address addressOld = (Address) factory.getBean("address1");
		// addressOld.getMessage();

		/*
		 * Employee empOld1 = (Employee) factory.getBean("employee2");
		 * empOld1.getMessage();
		 * 
		 * 
		 * Address addressOld1 = (Address) factory.getBean("address2");
		 * addressOld1.getMessage();
		 * 
		 * ((ConfigurableBeanFactory) factory).destroySingletons();
		 * 
		 * AbstractApplicationContext abstractContext = new
		 * ClassPathXmlApplicationContext("lazyloading.xml");
		 * 
		 * Employee abstractEmp = (Employee)
		 * abstractContext.getBean("employee"); abstractEmp.getMessage();
		 * 
		 * Address abstractAddress = (Address)
		 * abstractContext.getBean("address1"); abstractAddress.getMessage();
		 * 
		 * abstractContext.registerShutdownHook();
		 */

		/*
		 * Output: Done accessing xml 
		 * LAZY LOADING - [ONLY CREATED WHEN ACCESSED]
		 * Creating address! 
		 * The employee is now working 
		 * Accessing bean name: Mr. Derpinson
		 * 
		 */
		ApplicationContext contextLazy = new ClassPathXmlApplicationContext(
				"lazyloading.xml");
		BeanFactory factory01 = (BeanFactory) contextLazy;
		System.out.println("Done accessing xml");

		Employee ent = (Employee) factory01.getBean("employee2");
		System.out.println("Accesing bean name: " + ent.getName());

		((AbstractApplicationContext) contextLazy).close();

		/*
		 * Output: 
		 * normal LOADING - [CREATED EVEN BEFORE IT IS ACCESSED]
		 * Creating address! 
		 * The employee is now working 
		 * Done accessing xml 
		 * Accessing bean name: Mr. Derpinson
		 */

		ApplicationContext contextNormal = new ClassPathXmlApplicationContext(
				"normalloading.xml");
		BeanFactory factory02 = (BeanFactory) contextNormal;
		System.out.println("Done accessing xml");

		Employee empNotLazy = (Employee) factory02.getBean("employee1");
		System.out.println("Accesing bean name: " + empNotLazy.getName());

		((AbstractApplicationContext) contextNormal).close();
	}

}
