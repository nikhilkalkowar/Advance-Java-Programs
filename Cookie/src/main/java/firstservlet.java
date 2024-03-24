

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the data
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		//Create the cookie objects
		Cookie cookie1 = new Cookie("name", name);
		Cookie cookie2 = new Cookie("age", age);
		
		//add the cookies into responce object
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("form2.html");
		dispatcher.forward(request, response);
		
		
	}

}
