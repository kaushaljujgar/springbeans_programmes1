package com.jspiders.hibernatespr1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.hibernatespr1.beans.StudentBean;

import lombok.Data;

public class StudentMain {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("studentconfig.xml");
	StudentBean student2=(StudentBean)context.getBean("student2");
	System.out.println(student2);
	
	
	
	((ClassPathXmlApplicationContext)context).close();
	
}

}
