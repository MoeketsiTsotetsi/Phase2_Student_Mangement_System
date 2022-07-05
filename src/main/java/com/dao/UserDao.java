package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.User;
import com.resource.SessionBuilderResource;

public class UserDao {

	public int signIn(User u) {
		SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
	
		Session session = sf.openSession();
		Query<User> qry = session.createQuery("select u from User u where u.username = :username and u.password = :password");		//HQL 
		qry.setParameter("username", u.getUsername());
		qry.setParameter("password", u.getPassword());
		List<User> lu = qry.list();
		
		session.close();
		return lu.size();
	}
}
