package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Subject;
import com.bean.Teacher;
import com.resource.SessionBuilderResource;

public class TeacherDao {

	public int saveTeacher(Subject sub) {
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction trans = session.getTransaction();
			trans.begin();
			session.merge(sub);
			trans.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Teacher> getAllTeachers(){
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Query<Teacher> qry = session.createQuery("select t from Teacher t");
			List<Teacher> listOfTeachers = qry.list();
			return listOfTeachers;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Teacher getTeacherById(int id) {
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session  = sf.openSession();
			Teacher t = session.get(Teacher.class, id);
			return t;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
