package com.ace.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//Utility class for getting SessionFactory object for database access
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	//Method to return the session factory object for database access
	public static SessionFactory getSessionFactory() {
		
		//Configuring the Hibernate
		Configuration config = new Configuration();
		config.configure("hibernate-config.xml");
		
		//Creating service registry object
		serviceRegistry = new StandardServiceRegistryBuilder()
											  .applySettings(config.getProperties()).build();
		
		//Creating the session factory object
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
	}
}
