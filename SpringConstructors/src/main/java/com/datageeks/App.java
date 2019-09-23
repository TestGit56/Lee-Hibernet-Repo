package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.dao.StockDetails;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(" Spring Demo Constructor Injection");
    	
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	StockDetails stock =	container.getBean(StockDetails.class);
			
    	stock.getStockinfo();
    }
}