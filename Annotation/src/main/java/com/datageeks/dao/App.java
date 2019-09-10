package com.datageeks.dao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ProductDAO dao=new ProductDAO();
    			ProductBean saverecord=new ProductBean("Apple4s",12000f);
    	dao.save(saverecord);
   }
}
