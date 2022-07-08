package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Subject;
import com.bean.Teacher;
import com.service.SubjectService;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherServlet
 */
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TeacherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession hs = request.getSession();
		TeacherService ts = new TeacherService();
		RequestDispatcher rd = request.getRequestDispatcher("ViewTeachers.jsp");
		List<Teacher>listOfTeachers  = ts.getAllTeachers();
		hs.setAttribute("tList", listOfTeachers);
		
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullname = request.getParameter("fullname");
		String level = request.getParameter("level");
		int sub_id = Integer.parseInt(request.getParameter("sub_id"));
		HttpSession hs = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("AddTeacher.jsp");
		String result;
		
		Pattern p = Pattern.compile("[a-zA-Z\\s']+");
		Matcher m1 = p.matcher(fullname);
		Matcher m2 = p.matcher(level);
		
		

		if (fullname.isBlank() || level.isBlank() || !m1.matches() || !m2.matches()) {
			result = "Please Enter Correct  Details";
			hs.setAttribute("result", result);
			rd.include(request, response);

		} else {
			
			SubjectService sss = new SubjectService();
			Subject sub = sss.getSubjectById(sub_id);
			Teacher t = new Teacher();
			
			TeacherService ts = new TeacherService();
			t.setFullname(fullname);
			t.setLevel(level);

			List<Teacher> listOfTeachers = sub.getListOfTeachers();
			listOfTeachers.add(t);
			result = ts.saveTeacher(sub);
			hs.setAttribute("result", result);
			rd.include(request, response);

		}
	}

}
