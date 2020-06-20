package com.sai.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Hello from Xml servlet GET method.");
		  
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String userName = request.getParameter("userName");
		  
		  HttpSession session = request.getSession();
		  ServletContext context= request.getServletContext();
		  if(userName !="" && userName !=null)
		  {
		  session.setAttribute("savedUserName", userName);
		  context.setAttribute("savedUserName", userName);
		  }
		  out.println("Hello! "+userName);
		  out.println("Session parameter has username as "+(String)session.getAttribute("savedUserName"));
		  out.println("Context parameter has username as "+(String)context.getAttribute("savedUserName"));
		  
		  
		
		
//		  PrintWriter writer = response.getWriter();
//		  writer.println("<h3>Hello from Xml servlet in html</h3>");
//		 
//        response.getWriter().print("Hello from Xml Servlet GET method - on the web page!");
//        
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Hello from Xml servlet GET method.");
		  
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String userName = request.getParameter("userName");
		  String fullName = request.getParameter("fullName");
		  out.println("Hello from POST method! "+userName+" Your full Name is "+ fullName);
		  
		  String prof =request.getParameter("prof");
		  out.println("You are a " + prof);
		  
//		  String location=request.getParameter("location");
		
		  String[] location=request.getParameterValues("location");
		  out.println("You are at "+ location.length +"places");
		  
		  for(int i=0;i<location.length;i++)
		  {
			  out.println(location[i]);
		  }
		
	}
	
	
	
	
}
