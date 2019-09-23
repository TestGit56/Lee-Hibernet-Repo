package com.datageeks.dao;

import java.io.Serializable;

public class StockDetails implements Serializable{
	private ProductBean productref = null;
	

	public StockDetails() {
		super();
		// TODO Auto-generated constructor stub
	}




	public void setProductref(ProductBean productref) {
		this.productref = productref;
	}




public void stockInfo() {
	System.out.println(productref.getInfo());
}


}
