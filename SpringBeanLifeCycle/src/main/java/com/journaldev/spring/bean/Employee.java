package com.journaldev.spring.bean;

public class Employee {

	private String name;
	
	public Employee() {
		System.out.println("Employee no-args contructor called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
