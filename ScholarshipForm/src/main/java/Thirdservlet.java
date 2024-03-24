

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Thirdservlet")
public class Thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		long mobile  = Long.parseLong(request.getParameter("mobile No"));
		
		HttpSession session = request.getSession(false);
		
		response.setContentType("text/html");
		PrintWriter Writer = response.getWriter();
		
		Writer.println("<html>");
		Writer.println("<body>");
		Writer.println("name="+session.getAttribute("name"));
		Writer.println("<br><br>");
		Writer.println("age="+session.getAttribute("age"));
		Writer.println("<br><br>");
		Writer.println("Qualification="+session.getAttribute("qualification"));
		Writer.println("<br><br>");
		Writer.println("Designation="+session.getAttribute("Designation"));
		Writer.println("<br><br>");
		Writer.println("Email= "+email);
		Writer.println("<br><br>");
		Writer.println("Mobile No="+mobile);
		Writer.println("</body>");
		Writer.println("</html>");
		
		
		
	}

}
