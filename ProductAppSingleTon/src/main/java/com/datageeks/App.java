package com.datageeks;

import com.datageeks.dao.ProductBean;
import com.datageeks.dao.ProductDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
        {
    ProductDAO dao=new ProductDAO();
    ProductBean product=dao.getById(111);
    if(product==null)
    {
    
    	System.out.println( "invalide product id" );
    }
    else
    {
    	System.out.println(product);
    }
    }
}
