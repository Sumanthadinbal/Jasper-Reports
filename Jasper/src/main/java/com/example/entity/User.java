package com.example.entity;

public class User {
	
	private Detail s;
	private String name;
	private String contact;
	
	public User() {
		super();
	}

	public User(Detail s, String name, String contact) {
		super();
		this.s = s;
		this.name = name;
		this.contact = contact;
	}

	public Detail getId() {
		return s;
	}

	public void setId(Detail id) {
		this.s = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
