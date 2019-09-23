package com.datageeks.service;

import com.datageeks.dao.EmployeeDAO;

public class EmployeeService {
private EmployeeDAO employeeDAORef = null; 
	public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setEmployeeDAORef(EmployeeDAO employeeDAORef) {
		this.employeeDAORef = employeeDAORef;
	}


	public void getInfo()
	{
		employeeDAORef.getInfo();
		System.out.println(" From EmployeeController :: I implement  Presentation Logics ::");
		
	}

}
