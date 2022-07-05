package com.service;

import java.util.List;

import com.bean.Class;
import com.dao.ClassDao;

public class ClassService {
	ClassDao cd = new ClassDao();

	public String saveClass(Class c) {
		if (cd.saveClass(c) > 0) {
			return "Class Saved";
		} else {
			return "Class Not Saved";
		}
	}
	
	public List<Class>getAllClasses(){
		return cd.getAllClasses();
	}
	
	public Class getClassById(int id) {
		return cd.getClassById(id);
	}
}
