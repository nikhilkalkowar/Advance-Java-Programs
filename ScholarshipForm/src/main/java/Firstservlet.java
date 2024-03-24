

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				String name = request.getParameter("name");
				int age = Integer.parseInt(request.getParameter("age"));
				
				HttpSession session =request.getSession();
				
				session.setAttribute("name",name);
				session.setAttribute("age", age);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("page2.html");
				dispatcher.forward(request, response);
				
				
		
	}

}
