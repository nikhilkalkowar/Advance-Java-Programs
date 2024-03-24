package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Read the data
        int empId = Integer.parseInt(request.getParameter("empId"));
        String empName = request.getParameter("empName");
        double empSalary = Double.parseDouble(request.getParameter("empSalary"));

        // Process the data
        double hra, da, pf;

        if (empSalary >= 50000) {
            hra = 0.30 * empSalary;
            da = 0.10 * empSalary;
            pf = 0.06 * empSalary;
        } 
        else if (empSalary >= 25000) {
            hra = 0.20 * empSalary;
            da = 0.05 * empSalary;
            pf = 0.03 * empSalary;
        } 
        else {
            hra = 0.20 * empSalary;
            da = 0.03 * empSalary;
            pf = 0.02 * empSalary;
        }

        // Process the data
        double grossSalary = empSalary + hra + da - pf;

        // Render the response
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Employee Details</h1>");
        writer.println("Employee ID : " + empId);
        writer.println("<br><br>");
        writer.println("Employee name : " + empName);
        writer.println("<br><br>");
        writer.println("Employee Basic Salary : " + empSalary);
        writer.println("<br><br>");
        writer.println("HRA Amount : " + hra);
        writer.println("<br><br>");
        writer.println("DA Amount : " + da);
        writer.println("<br><br>");
        writer.println("PF Amount : " + pf);
        writer.println("<br><br>");
        writer.println("Gross Salary : " + grossSalary);
        writer.println("</body>");
        writer.println("</html>");
    }
}
