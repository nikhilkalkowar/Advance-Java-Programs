package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class calculatorservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Step :1 Read the requested data.
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String operation = request.getParameter("operation");
		
		//Step :2 Process The Data;
		int result=0;
		switch (operation) {
		case "+": result=num1+num2;
					break;
		case "-": result=num1-num2;
					break;
		case "*": result=num1*num2;
					break;
		case "/": result=num1/num2;
					break;
		case "%": result=num1%num2;
					break;
		}
		
		//Step 3: Render the Response.
		response.setContentType("text/html");
		
		PrintWriter writer=response.getWriter();
		
		writer.println("<html>");
		writer.println("Result : "+ result);
		writer.println("</html>");
		
		
		
		
		
		
		
		
		
		
		
	}

}