package com.jspiders.hibernatespr1.beans;

import lombok.Data;

@Data
public class Husband {
	private int id;
	private String name;
	private int age;
	Wife wife;
	

}
