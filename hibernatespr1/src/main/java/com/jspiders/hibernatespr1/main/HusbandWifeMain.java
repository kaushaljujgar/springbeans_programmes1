package com.jspiders.hibernatespr1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.hibernatespr1.beans.Husband;

public class HusbandWifeMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("HusbandWifeConfig.xml");
		Husband husband1=context.getBean(Husband.class);
	   System.out.println(husband1);
	   ((ClassPathXmlApplicationContext)context).close();
	   
	}
	
}
