package com.datageeks.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
	private static final SessionFactory SESSESION_FACTORY;
	static {
		synchronized (HBUtil.class) {
			Configuration cfg=new Configuration();
			cfg.configure("oracle.cfg.xml");
			SESSESION_FACTORY =cfg.buildSessionFactory();
			
			
		}
		
	}
public static SessionFactory getSessionFactory()
{
	return SESSESION_FACTORY;
}
}
