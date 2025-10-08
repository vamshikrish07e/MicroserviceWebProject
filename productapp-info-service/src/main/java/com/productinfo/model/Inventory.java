package com.productinfo.model;

public class Inventory {

	private Integer productId;
	private int quantity;
	
	
	
	public Inventory() {
		super();
	}

	public Inventory(Integer productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
