package com.datageeks.dao;

public class ProductBean{
	private Integer productId = null;
	private String productName = null;
	private Float productPrice = null;
	
	
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	public String getInfo() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
		
	

}
