package com.datageeks.dao;

import com.datageeks.dao.ProductBean;

public class StockDetails {
	private ProductBean  productref = null;

	public StockDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void setProductref(ProductBean productref) {
		this.productref = productref;
	}



	public void getStockinfo()
	{
		System.out.println(productref.getInfo());
	}

}
