package com.jspiders.hibernatespr1.beans;

import lombok.Data;

@Data
public class Employee {

	private int id;
	private String name;
	private int salary;
	Company company;
}
