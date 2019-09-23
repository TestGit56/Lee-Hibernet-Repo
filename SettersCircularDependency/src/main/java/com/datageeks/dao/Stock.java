package com.datageeks.dao;

public class Stock {
	private ProductBean productref = null;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setProductref(ProductBean productref) {
		this.productref = productref;
	}
	
public void getStockDetails() {
	System.out.println("Stock class executed");
	System.out.println(productref.getInfo());
}
}
