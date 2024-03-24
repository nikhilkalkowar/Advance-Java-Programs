package com.sathya.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondSevlet")
public class SecondSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   		String Qual=request.getParameter("qualification");
   		String Desc=request.getParameter("designation");
   		
   		HttpSession session=request.getSession(false);
   		
   		session.setAttribute("Qual",Qual);
   		session.setAttribute("Desc", Desc);
   		
   		RequestDispatcher dispatcher=request.getRequestDispatcher("Form3.html");
   		dispatcher.forward(request, response);
   		
	}

}
