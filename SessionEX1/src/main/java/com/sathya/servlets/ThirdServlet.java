package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String Email=request.getParameter("email");
    	int Mobile=Integer.parseInt(request.getParameter("mobile"));
    	
    	HttpSession session=request.getSession(false);
    	
    	
    	
    	response.setContentType("text/html");
    	PrintWriter writer=response.getWriter();
    	
    	writer.println("<html>");
    	writer.println("<body>");
    	writer.println("<pre>");
    	writer.println("Username="+session.getAttribute("Username"));
    	writer.println("Age="+session.getAttribute("Age"));
    	writer.println("Qualification= "+session.getAttribute("Qual"));
    	writer.println("Designation= "+session.getAttribute("Desc"));
    	writer.println("Email= "+Email);
    	writer.println("Mobile= "+Mobile);
    	writer.println("</pre>");
    	writer.println("</body>");
    	writer.println("</html>");
    	
    	
    	
    	
	}

}
