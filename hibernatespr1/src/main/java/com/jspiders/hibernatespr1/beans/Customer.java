package com.jspiders.hibernatespr1.beans;

import java.util.List;

import lombok.Data;
@Data
public class Customer {

	private int id;
	private String name;
	private String email;
	private List<Product>products;
}
