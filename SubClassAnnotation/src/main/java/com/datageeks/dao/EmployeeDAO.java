package com.datageeks.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDAO {
	SessionFactory sessioFactory =HBUtil.getSessionFactory();
	public void saveOrupdate(Employee employee) {
		Session session=sessioFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(employee);
		session.getTransaction().commit();
		session.close();
	}
	public Employee getById(Integer emplId)
	{
		return sessioFactory.openSession().get(Employee.class, emplId);
	}
	public void delete(Integer emplId)
	{
		Session session=sessioFactory.openSession();
		session.beginTransaction();
		Employee emp=session.get(Employee.class, emplId);
		if(emp != null)
		session.delete(emp);
		session.getTransaction().commit();
		session.close();
		
		}
		
	}

