package com.service;

import java.util.List;

import com.bean.Subject;
import com.bean.Teacher;
import com.dao.TeacherDao;

public class TeacherService {

	TeacherDao td = new TeacherDao();
	
	public String saveTeacher(Subject sub) {
		if (td.saveTeacher(sub) > 0) {
			return "Teacher Saved Successfully";
			
		}else {
			return "Teacher Not Saved";
		}
	}
	
	public List<Teacher> getAllTeachers(){
		return td.getAllTeachers();
	}
}
