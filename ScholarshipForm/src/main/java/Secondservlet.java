

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Qualification = request.getParameter("qualification");
		String Designation = request.getParameter("designation");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("qualification",Qualification);
		session.setAttribute("Designation", Designation);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("page3.html");
		dispatcher.forward(request, response);
	}

}
