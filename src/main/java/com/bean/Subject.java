package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subject_id;
	private String name;
	private int credit;
	@OneToMany(mappedBy = "s_id",cascade = CascadeType.ALL)
	private List<Class> listOfClasses;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "subject_teacher",joinColumns = {@JoinColumn(name="subject_id")},inverseJoinColumns = {@JoinColumn(name="teacher_id")})
	private List<Teacher>ListOfTeachers;
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public List<Class> getListOfClasses() {
		return listOfClasses;
	}
	public void setListOfClasses(List<Class> listOfClasses) {
		this.listOfClasses = listOfClasses;
	}
	public List<Teacher> getListOfTeachers() {
		return ListOfTeachers;
	}
	public void setListOfTeachers(List<Teacher> listOfTeachers) {
		ListOfTeachers = listOfTeachers;
	}
	
	
}
