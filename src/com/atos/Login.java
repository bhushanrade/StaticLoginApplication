package com.atos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter  = response.getWriter();
		response.setContentType("text/html");
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		if((request.getParameter("username").equals("root"))&&(request.getParameter("password").equals("root")))
		{
			printWriter.println("login Successful");
			System.out.println("*********************login Successful***************************");
		}
		else
		{
			printWriter.println("<font color='red'>login Failed !!! Please try again </font>");
			System.out.println("*********************login Failed***************************");
		}
			
			
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
