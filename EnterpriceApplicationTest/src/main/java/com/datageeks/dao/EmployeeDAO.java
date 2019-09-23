package com.datageeks.dao;

public class EmployeeDAO {
private String message = null;
	public EmployeeDAO() {
		
	}
	
public void setMessage(String message) {
		this.message = message;
	}

public void getInfo()
{
	System.out.println("enterprice application");
System.out.println(message);
}
}
