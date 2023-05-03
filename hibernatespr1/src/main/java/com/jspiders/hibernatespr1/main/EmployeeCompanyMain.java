package com.jspiders.hibernatespr1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.hibernatespr1.beans.Employee;

public class EmployeeCompanyMain {
  public static void main(String[] args) {
	
	  ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeCompanyConfig.xml");
	  
	  Employee employee1=(Employee)context.getBean("employee1");
	  Employee employee2=(Employee)context.getBean("employee2");
	  System.out.println(employee1);
	  System.out.println(employee2);
	   ((ClassPathXmlApplicationContext)context).close();
	  
	  
}
}
