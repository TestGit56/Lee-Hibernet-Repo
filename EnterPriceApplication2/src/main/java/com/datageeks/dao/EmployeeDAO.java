package com.datageeks.dao;

public class EmployeeDAO {
	
	private String message;

	public EmployeeDAO() {
	}

	
	public void setMessage(String message) {
		this.message = message;
	}


	public void getInfo()
	{
		System.out.println(message);
		System.out.println(" From EmployeeDAO :: I implement Database interaction logics");
		
	}
	
}