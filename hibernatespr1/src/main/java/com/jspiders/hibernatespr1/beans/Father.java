package com.jspiders.hibernatespr1.beans;

import java.util.List;

import lombok.Data;
@Data
public class Father {
 
	private int id;
	private String name;
	private int age;
	private List<Child>children;
}
