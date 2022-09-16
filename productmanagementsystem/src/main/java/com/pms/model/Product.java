package com.pms.model;

import java.util.Date;

public class Product {
	private Integer productId;
	private String productName;
	private Integer productPrice;
	private Date manufactured_Date;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String productName, Integer productPrice, Date manufactured_Date) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.manufactured_Date = manufactured_Date;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public Date getManufactured_Date() {
		return manufactured_Date;
	}
	public void setManufactured_Date(Date manufactured_Date) {
		this.manufactured_Date = manufactured_Date;
	}
	
}
