package com.service;

import com.bean.Class;
import com.bean.Subject;
import com.bean.Teacher;
import com.dao.ClassDao;
import com.dao.SubjectDao;
import com.dao.TeacherDao;

public class ClassReportService {
ClassDao cd = new ClassDao();
SubjectDao sd = new SubjectDao();
TeacherDao td = new TeacherDao();

public Class getClassById(int id) {
	return cd.getClassById(id);
}

public Subject getSubjectById(int id) {
	return sd.getSubjectById(id);
}

public Teacher getTeacherById(int id) {
	return td.getTeacherById(id);
}
}
