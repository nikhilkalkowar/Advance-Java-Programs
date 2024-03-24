

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/thirdservlet")
public class thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	 protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        
	        Cookie a []= request.getCookies();
	        
	        
	     
	        response.setContentType("text/html");
			PrintWriter Writer = response.getWriter();
			
			Writer.println("<html>");
			Writer.println("<body>");
			Writer.println("name="+a[0].getValue());
			Writer.println("<br><br>");
			Writer.println("age="+a[1].getValue());
			Writer.println("<br><br>");
			Writer.println("college="+a[2].getValue());
			Writer.println("<br><br>");
			Writer.println("branch="+a[3].getValue());
			Writer.println("<br><br>");
			Writer.println("cgpa= "+a[4].getValue());
			Writer.println("<br><br>");
			Writer.println("Email= "+request.getParameter(email));
			Writer.println("<br><br>");
			Writer.println("Mobile No="+request.getParameter(mobile));
			Writer.println("</body>");
			Writer.println("</html>");
	 }
}