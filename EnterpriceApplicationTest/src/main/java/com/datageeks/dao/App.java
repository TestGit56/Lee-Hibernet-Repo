package com.datageeks.dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.controller.EmployeeController;

/**
 * Hello world!
 *
 */
public class App 	
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	EmployeeController controller = springContainer.getBean(EmployeeController.class);
    	controller.getInfo();
    }
}