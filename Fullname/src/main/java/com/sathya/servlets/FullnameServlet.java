package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;s
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FullnameServlet")
public class FullnameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String secondname = request.getParameter("secondname");
		String lastname = request.getParameter("lastname");
		String fullname;
		
		fullname = firstname+" "+secondname+ " "+lastname;
		
		PrintWriter writer =response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>fullname</h1>" +fullname);
		writer.println("</html>");
		
	}

	}


