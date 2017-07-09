package com.example.entity;

import java.util.List;

public class Pool {
	
	private String name;
	
	private Integer quantity;
	
	private List<Location> location;

	public Pool() {
		super();
	}

	public Pool(String name, Integer quantity, List<Location> location) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}
	
	
}
