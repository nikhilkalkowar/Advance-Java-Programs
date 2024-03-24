package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	

        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// step 1 READ the Data
		
		String username = request.getParameter("username");
		String password = request.getParameter("Passsword");
		
		//STEP 2 PROCESS THE DATA
		
		String status;
		if(username.equals("Jai Shree Ram")&& password.equals("Ram@123"))
		{
			status = "login Successfull";
		}
		else
		{
			status = "login fail";
		}
		
		//STEP 3 
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Login Status</h1>" +status);
		writer.println("</html>");
		
		
		
	}

}
