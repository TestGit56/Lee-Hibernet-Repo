package com.datageeks.dao.NativeSql;

/**
 * Hello world!
 *
 */
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

    	ProductDAO dao = new ProductDAO();
    	
    	    System.out.println("getproductNames"+dao.getproductNames());	
    	System.out.println("\n\n getProductIDNames() !!! List<Object[]> ");
    	System.out.println(" pagination() => "+ dao.pagination()+"\n\n");
    	System.out.println(" search('lenovo') => "+ dao.search("lenovo")+"\n\n");
    	
    		List<Object[]> objArrayList = dao.getIdtNames();
    		for(Object[] objArray :objArrayList)
    		{
    			for(Object element: objArray)
    			{
    				System.out.print(element + " \t ");
    				
    			}
    			System.out.println();
    		}
    		System.out.println("\n\n getIdNamesRelaTimeUseCase() !!!  List<SearchCriteriaBean> ");
    		System.out.println(dao.getIdNamesRelaTimeUseCase()+"\n\n");
    		
    		
    		
    		System.out.println("  MAXPRICE :: "+dao.getMaxPrice()+"\n\n");
    		System.out.println(" getById() "+dao.getById(111)+"\n\n");
    		
    		System.out.println("Non select query :: updatePrice()  updatedCount = "+dao.updatePrice());
    	
    	
}
}