package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.service.SubjectService;

/**
 * Servlet implementation class AddSubjectController
 */
public class AddSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSubjectController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs = request.getSession();
		SubjectService ss = new SubjectService();
		List<Subject> listOfSubjects = ss.getAllSubjects();
		RequestDispatcher rd = request.getRequestDispatcher("ViewSubjects.jsp");

		hs.setAttribute("subList", listOfSubjects);
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("subName");
		int credit = Integer.parseInt(request.getParameter("credit"));
		
        HttpSession hs = request.getSession();
		
		RequestDispatcher rd2 = request.getRequestDispatcher("AddSubject.jsp");
		
		Pattern p = Pattern.compile("[a-zA-Z\\s']+");
		Matcher m1 = p.matcher(name);
		

		if (name.equals("") || credit == 0  || name.length()< 2 || !m1.matches()) {
			String ver ="Please enter the correct details";
			hs.setAttribute("result", ver);
			rd2.include(request, response);
		} else {
			Subject sub = new Subject();
			
			sub.setName(name);
			sub.setCredit(credit);

			SubjectService ss = new SubjectService();
			String result = ss.saveSubject(sub);

			hs.setAttribute("result", result);
			rd2.include(request, response);
		}
		
		hs.invalidate();

	}

}
