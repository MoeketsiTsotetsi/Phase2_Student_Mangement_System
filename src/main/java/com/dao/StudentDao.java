package com.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Class;
import com.bean.Student;
import com.resource.SessionBuilderResource;

public class StudentDao {

	
	public int saveStudent(Class c) {
		try {
			SessionFactory sf =  SessionBuilderResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction trans = session.getTransaction();
			trans.begin();
			session.merge(c);
			trans.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Student> getAllStudents(){
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Query<Student> qry = session.createQuery("select s from Student s ORDER BY s.c_id asc");
			List<Student> listOfStudents = qry.list();
			
			
			return listOfStudents;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
