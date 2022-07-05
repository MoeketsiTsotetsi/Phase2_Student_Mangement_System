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

import com.bean.Class;
import com.service.ClassService;

/**
 * Servlet implementation class ClassServlet
 */
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		PrintWriter pw = response.getWriter();
		ClassService cs = new ClassService();
		List<Class> listOfCla = cs.getAllClasses();
		RequestDispatcher rd1 = request.getRequestDispatcher("ClassList.jsp");

		hs.setAttribute("list", listOfCla);
		
		rd1.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		String name = request.getParameter("cname");
		int hours = Integer.parseInt(request.getParameter("hours"));
		int s_id = Integer.parseInt(request.getParameter("s_id"));
		RequestDispatcher rd = request.getRequestDispatcher("AddClass.jsp");
		Class c = new Class();
		
		c.setHours(hours);
		c.setName(name);
		c.setS_id(s_id);
		ClassService cs = new ClassService();
		String result = cs.saveClass(c) ;
		
		hs.setAttribute("result", result);
		
		rd.include(request, response);
		
		
		
	}

}
