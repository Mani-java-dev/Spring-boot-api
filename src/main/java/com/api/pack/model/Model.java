package com.api.pack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Model {
    
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String Gmail;
	private String password;
	
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
	public String getGmail() {
		return Gmail;
	}
	public void setGmail(String gmail) {
		Gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", Gmail=" + Gmail + ", password=" + password + "]";
	}
	
	
	
	
	
}
