package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int proId = Integer.parseInt(request.getParameter("proId"));
        String proName = request.getParameter("proName");
        double proPrice = Double.parseDouble(request.getParameter("proPrice"));
        int proQuantity = Integer.parseInt(request.getParameter("proQuantity"));

        // Process the data
        double total_Bill = proPrice * proQuantity;
        double discount;
        double net_Amount;

        if (total_Bill < 1000)
            discount = 0;
        else if (total_Bill >= 1000 && total_Bill < 5000)
            discount = total_Bill * 0.05;
        else if (total_Bill >= 5000 && total_Bill < 10000)
            discount = total_Bill * 0.1;
        else
            discount = total_Bill * 0.15;

        net_Amount = total_Bill - discount;

        // Render the response
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Product Details</h1>");
        writer.println("Product ID: " + proId  );
        writer.println("<br><br>");
        writer.println("Product Name: " + proName );
        writer.println("<br><br>");
        writer.println("Product Price: " + proPrice );
        writer.println("<br><br>");
        writer.println("Product Quantity: " + proQuantity );
        writer.println("<br><br>");
        writer.println("Total Bill: " + total_Bill  );
        writer.println("<br><br>");
        writer.println("Discount: " + discount );
        writer.println("<br><br>");
        writer.println("Net Amount: " + net_Amount );
        writer.println("<br><br>");
        writer.println("</body>");
        writer.println("</html>");
        
     

    }
}
