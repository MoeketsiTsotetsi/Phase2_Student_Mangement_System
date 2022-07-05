package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Class;
import com.bean.Teacher;
import com.resource.SessionBuilderResource;

public class ClassDao {

	
	public int saveClass(Class c) {
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session = sf .openSession();
			Transaction trs = session.getTransaction();
			trs.begin();
			session.save(c);
			trs.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Class> getAllClasses(){
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Query<Class> qry = session.createQuery("select c from Class c");
			List<Class> listOfClasses = qry.list();
			
			return listOfClasses;
			
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Class getClassById(int id) {
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Class c = session.get(Class.class, id);
			
			return c;
			
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
