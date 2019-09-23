package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.dao.Stock;

public class App {
	public static void main(String[] args)
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		Stock stock = container.getBean(Stock.class);
		stock.getStockDetails();
	}

}
