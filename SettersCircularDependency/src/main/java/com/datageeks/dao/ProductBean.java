package com.datageeks.dao;

public class ProductBean {
	

	private Integer productId = null;
	private String productName = null;
	private Float productPrice =null;
	
	
	private Stock stockref = null;
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	

	public String getInfo() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", stockref=" + stockref + "]";
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

	
	public void setStock(Stock stockref) {
		this.stockref = stockref;
	}
	
	


}
