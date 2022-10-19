package com.cruzeiro;

public class Student {
	private String name;
	private String lastName;
	private String email;
	private int rgm;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	
	
	public Student(String name, String lastName, String email, int rgm) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.rgm = rgm;
	}
	
	
	
}
