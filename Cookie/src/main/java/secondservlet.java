

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondservlet")
public class secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String college = request.getParameter("college");
		String branch = request.getParameter("branch");
		String cgpa = request.getParameter("cgpa");
		
		Cookie cookie3 = new Cookie("college", college);
		Cookie cookie4 = new Cookie("branch", branch);
		Cookie cookie5 = new Cookie("cgpa", cgpa);
		
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		response.addCookie(cookie5);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("form3.html");
		dispatcher.forward(request, response);
		
		
		
		
	}

}
