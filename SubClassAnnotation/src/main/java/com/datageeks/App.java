package com.datageeks;

import com.datageeks.dao.Employee;
import com.datageeks.dao.EmployeeDAO;
import com.datageeks.dao.RegularEmployee;

/**	
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {

    	EmployeeDAO dao = new EmployeeDAO();
    	//dao.delete(111);
    	RegularEmployee regemp=new RegularEmployee(777,"naresh i",120000f,100f);
    	dao.saveOrupdate(regemp);
    	//Employee emp =new Employee(555,"ramu");
    	
		//dao.saveOrupdate(emp);
    }
}
