package com.datageeks.service;

import java.util.List;

import com.datageeks.dao.DataSourceException;
import com.datageeks.dao.EmployeeBean;
import com.datageeks.dao.EmployeeDAO;;

public class EmployeeService {

	EmployeeDAO dao = new EmployeeDAO();

	public List<EmployeeBean> search(String employeeName) throws ServicesException {
		List<EmployeeBean> empList = null;

		try {
			empList = dao.search(employeeName);
		} catch (DataSourceException exp) {	
			exp.printStackTrace();
			throw new ServicesException(exp.getMessage());
		}
		return empList;
	}

	public void delete(Integer employeeId) throws ServicesException {

		try {
			dao.delete(employeeId);
		} catch (DataSourceException exp) {
			exp.printStackTrace();
			throw new ServicesException(exp.getMessage());
		}
	}

	public List<EmployeeBean> getAll() throws ServicesException {
		List<EmployeeBean> empList = null;

		try {
			empList = dao.getAll();
		} catch (DataSourceException exp) {
			exp.printStackTrace();
			throw new ServicesException(exp.getMessage());
		}
		return empList;
	}

	public EmployeeBean get(Integer employeeId) throws ServicesException {
		EmployeeBean employee = null;

		try {
			employee = dao.get(employeeId);
		} catch (DataSourceException exp) {
			exp.printStackTrace();
			throw new ServicesException(exp.getMessage());
		}
		return employee;
	}

	public void saveOrUpdate(EmployeeBean employee) throws ServicesException {

		try {
			dao.saveOrUpdate(employee);
		} catch (DataSourceException exp) {
			exp.printStackTrace();
			throw new ServicesException(exp.getMessage());
		}
	}
}