package com.datageeks.dao.ProductApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.dao.StockDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	StockDetails stock = container.getBean(StockDetails.class);
			
    	stock.stockInfo();
    }
}
