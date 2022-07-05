package com.service;

import java.util.List;

import com.bean.Class;
import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
StudentDao sd = new StudentDao();

public String saveStudent(Class c) {
	if (sd.saveStudent(c) > 0) {
		return "Student Saved";
	}else {
		return "Student Not Saved";
	}
}

public List<Student> getAllStudents(){
	return sd.getAllStudents();
}
}
