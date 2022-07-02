package com.service;

import java.util.List;

import com.bean.Subject;
import com.dao.SubjectDao;

public class SubjectService {
SubjectDao sd = new SubjectDao();


public String saveSubject(Subject sub) {
	if (sd.saveSubject(sub) >0) {
		return "Subject Added";
	}else {
		return "Subject Not Added";
	}
}

public Subject getSubjectById(int id) {
	return sd.getSubjectById(id);
}

public List<Subject>getAllSubjects(){
	return sd.getAllSubjects();
}
}
