package com.resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionBuilderResource {
	public static SessionFactory getSessionFactoryReference() {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		return sf;
	}
}
