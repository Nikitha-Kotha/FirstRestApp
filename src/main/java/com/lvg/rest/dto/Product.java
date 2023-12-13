package com.lvg.rest.dto;

public class Product {
	
	private int productId;
	private String productName;
	private String productDecsription;
	private double productprice;
	public Product() {
	
	}
	public Product(int productId, String productName, String productDecsription, double productprice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDecsription = productDecsription;
		this.productprice = productprice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int d) {
		this.productId = d;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDecsription() {
		return productDecsription;
	}
	public void setProductDecsription(String productDecsription) {
		this.productDecsription = productDecsription;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public void setProductQuantity(int productQuantity) {
		// TODO Auto-generated method stub
		
	}
	
	
	}


