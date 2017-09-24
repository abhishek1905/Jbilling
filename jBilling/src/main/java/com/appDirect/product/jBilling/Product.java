package com.appDirect.product.jBilling;

import com.google.gson.annotations.SerializedName;

public class Product {
	
	private int productId;
	@SerializedName("name")
	private String productName;
	@SerializedName("basePrice")
	private double basePrice;
	
	public Product(int id, String name, double base){
		this.productId = id;
		this.productName = name;
		this.basePrice = base;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	
	

}
