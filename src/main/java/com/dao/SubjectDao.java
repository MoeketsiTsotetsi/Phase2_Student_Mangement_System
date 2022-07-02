package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Subject;
import com.resource.SessionBuilderResource;

public class SubjectDao {

	public int saveSubject(Subject sub) {
		try {
			SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction trans = session.getTransaction();
			trans.begin();
			session.save(sub);
			trans.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public Subject getSubjectById(int id) {
		SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
		Session session = sf.openSession();

		Subject s = session.get(Subject.class, id);

		return s;

	}
	
	public List<Subject>getAllSubjects(){
		SessionFactory sf = SessionBuilderResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Query<Subject> qry = session.createQuery("select s from Subject s");
		List<Subject> listOfSubjects = qry.list();
		return listOfSubjects;
	}
}
