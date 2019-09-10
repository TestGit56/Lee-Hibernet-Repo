package com.datageeks.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.datageeks.dao.EmployeeBean;

public class EmployeeDAO {

	private SessionFactory sessionFactory = HBUtil.getSessionFactory();

	public EmployeeBean get(Integer id) throws DataSourceException {
		EmployeeBean empBean = null;

		try {	
			empBean = sessionFactory.openSession().get(EmployeeBean.class, id);
		} catch (HibernateException exp) {
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		}

		return empBean;

	}
	public void saveOrUpdate(EmployeeBean emp) throws DataSourceException {
		Session session = null;

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(emp);
			session.getTransaction().commit();
		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

	}
	public void delete(Integer id) throws DataSourceException {
		Session session = null;

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			EmployeeBean empBean = sessionFactory.openSession().get(EmployeeBean.class, id);
			if (empBean != null) {
				session.delete(empBean);
				session.getTransaction().commit();
			}

		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

	}

	public List<EmployeeBean> search(String EmployeeName) throws DataSourceException {
		List<EmployeeBean> empList = null;
		Session session = null;

		String hql = " Select e From EmployeeBean e where upper(e.employeeName) like :ename";

		try {	
			session = sessionFactory.openSession();
			TypedQuery<EmployeeBean> query = session.createQuery(hql, EmployeeBean.class);
			query.setParameter("ename", "%" + EmployeeName.trim().toUpperCase() + "%");

			empList = query.getResultList();

		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

		return empList;
	}
	public List<EmployeeBean> getAll() throws DataSourceException {
		List<EmployeeBean> empList = null;
		Session session = null;

		String hql = " Select e From EmployeeBean e";

		try {
			session = sessionFactory.openSession();
			TypedQuery<EmployeeBean> query = session.createQuery(hql, EmployeeBean.class);
			empList = query.getResultList();

		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

		return empList;
	}
	
		}
