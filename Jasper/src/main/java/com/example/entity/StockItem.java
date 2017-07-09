package com.example.entity;

public class StockItem {

	private String code;
	
	private String description;
	
	private Integer quantity;

	public StockItem() {
		super();
	}

	public StockItem(String code, String description, Integer quantity) {
		super();
		this.code = code;
		this.description = description;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
