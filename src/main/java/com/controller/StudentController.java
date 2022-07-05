package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Class;
import com.bean.Student;
import com.bean.Subject;
import com.bean.Teacher;
import com.service.ClassService;
import com.service.StudentService;
import com.service.SubjectService;
import com.service.TeacherService;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentService ss = new StudentService();
		HttpSession hs = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("ViewStudents.jsp");

		List<Student> listOfStudents = ss.getAllStudents();

		hs.setAttribute("listStudent", listOfStudents);

		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		int  c_id = Integer.parseInt(request.getParameter("class_id"));
	
		HttpSession hs = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("AddStudent.jsp");
		String result;

		if (fullname.isBlank() || c_id ==0) {
			result = "Please enter all details";
			hs.setAttribute("result", result);
			rd.include(request, response);

		} else {
			
			ClassService cs = new ClassService();
			Class c = cs.getClassById(c_id);
			Student s = new Student();
			
			 StudentService ss = new StudentService();
			s.setFullname(fullname);
			s.setC_id(c_id);

			List<Student> listOfStu = c.getListOfStudent();
			listOfStu.add(s);
			result = ss.saveStudent(c);
			hs.setAttribute("result", result);
			rd.include(request, response);

		}
	}

}
