package com.jspiders.hibernatespr1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.hibernatespr1.beans.Customer;

public class CustomerProductMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("CustomerProductConfig.xml");
		
	Customer customer1=(Customer)context.getBean("customer1");
	System.out.println(customer1);
	
	Customer customer2=(Customer)context.getBean("customer2");
	System.out.println(customer2);
	((ClassPathXmlApplicationContext)context).close();
	}
}
