package com.datageeks.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.datageeks.dao.ProductBean;

public class ProductDAO {
	private SessionFactory sessionFactory=HBUtil.getSessionFactory();
	public ProductBean getById(Integer productId)
	{
		ProductBean productBean=null;
		Session session=sessionFactory.openSession();
		productBean=session.get(ProductBean.class,productId);
		session.close();
		return productBean;
		
	}

}
