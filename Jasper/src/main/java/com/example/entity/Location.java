package com.example.entity;

import java.util.List;

public class Location {

	private String name;

	private Integer quantit;

	private List<StockItem> stockItems;

	public Location() {
		super();
	}

	public Location(String name, Integer quantity, List<StockItem> stockItems) {
		super();
		this.name = name;
		this.quantit = quantity;
		this.stockItems = stockItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantit;
	}

	public void setQuantity(Integer quantity) {
		this.quantit = quantity;
	}

	public List<StockItem> getStockItems() {
		return stockItems;
	}

	public void setStockItems(List<StockItem> stockItems) {
		this.stockItems = stockItems;
	}

}
