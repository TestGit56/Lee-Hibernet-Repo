package com.datageeks.dao.ProductAppHibernet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ProductDAO dao = new ProductDAO();
ProductBean bean = dao.getByID(322);

System.out.println(" output *** "+bean);
    }
}
