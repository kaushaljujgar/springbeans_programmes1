package com.jspiders.hibernatespr1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.hibernatespr1.beans.Father;

public class FatherChildConfig {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("FatherChildConfig.xml");
		
		Father father1=context.getBean(Father.class);
		
		System.out.println(father1);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
