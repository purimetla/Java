package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtil {

	public HibernateUtil() {
		// TODO Auto-generated constructor stub
	}
	
	private static SessionFactory sessionFactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//configure() is used to load hibernate.cfg.xml file
		configuration.configure();
		
		//ServiceRegistry is used to register the properties in the config file
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
		
		ServiceRegistry registry = serviceRegistry.applySettings(configuration.getProperties()).build();
		
		//to create a SessionFactory, buildSessionFactory() is used
		sessionFactory = configuration.buildSessionFactory(registry);
		
			
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	

}
