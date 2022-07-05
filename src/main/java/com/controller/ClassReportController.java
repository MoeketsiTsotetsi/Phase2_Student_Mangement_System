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
import com.mysql.cj.xdevapi.Result;
import com.service.ClassReportService;

/**
 * Servlet implementation class ClassReportController
 */
public class ClassReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClassReportController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClassReportService crs = new ClassReportService();
		int c_id = Integer.parseInt(request.getParameter("c_id"));
		RequestDispatcher dest_one = request.getRequestDispatcher("ClassList.jsp");
		RequestDispatcher dest_two = request.getRequestDispatcher("ViewClassReport.jsp");
		HttpSession hs = request.getSession();

		Class c = crs.getClassById(c_id);

		if (c == null) {
			String result = "Class Not Found Enter Correct Class ID !!";
			hs.setAttribute("result", result);
			dest_one.include(request, response);

		} else {

			int sub_id = c.getS_id();
			List<Student>listStudent = c.getListOfStudent();
			Subject s = crs.getSubjectById(sub_id);
			List<Teacher> lstTeacher = s.getListOfTeachers();
			Teacher t = lstTeacher.get(0);
			
			hs.setAttribute("c", c);
			hs.setAttribute("ls", listStudent);
			hs.setAttribute("sub", s);
			hs.setAttribute("t", t);
			
			dest_two.forward(request, response);

			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
