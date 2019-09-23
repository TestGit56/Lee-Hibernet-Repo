package com.datageeks.controller;

import com.datageeks.service.EmployeeService;

public class EmployeeController {
	private EmployeeService employeeServiceRef = null;

	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setEmployeeServiceRef(EmployeeService employeeServiceRef) {
		this.employeeServiceRef = employeeServiceRef;
	}
	
	public void getInfo()
	{
		employeeServiceRef.getInfo();
		System.out.println("from the employeeService");
	}
	

}
