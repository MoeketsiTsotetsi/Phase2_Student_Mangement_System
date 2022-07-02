package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		PrintWriter pw = response.getWriter();
        HttpSession hs = request.getSession();
		
		RequestDispatcher rd2 = request.getRequestDispatcher("AddSubject.jsp");

		if (name.equals("") || credit == 0) {
			pw.println("Please enter all fields");
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

	}

}
