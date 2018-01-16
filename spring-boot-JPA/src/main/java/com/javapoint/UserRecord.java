package com.javapoint;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author matteodaniele
 * @update 1/07/2018
 * @version 0.2.1
 */
@Entity
public class UserRecord {
	
	@Id
	private int id;
	
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
