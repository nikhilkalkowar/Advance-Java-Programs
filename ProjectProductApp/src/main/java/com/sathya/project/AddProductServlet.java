package com.sathya.project;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/AddProductServlet")
@MultipartConfig

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public AddProductServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ProId=request.getParameter("proId");
		String ProName=request.getParameter("proname");
		double ProPrice=Double.parseDouble(request.getParameter("procost"));
		String ProBrand=request.getParameter("probrd");
		String MadeIn=request.getParameter("madein");
		Date ProMfgDate=Date.valueOf(request.getParameter("mfg"));
		Date ProExpDate=Date.valueOf(request.getParameter("exp"));
		Part part=request.getPart("proImg");
		InputStream ProImage=part.getInputStream();
		
		Product product=new Product();
		product.setProId(ProId);
		product.setProName(ProName);
		product.setProPrice(ProPrice);
		product.setProBrand(ProBrand);
		product.setProMadeIn(MadeIn);
		product.setProMfgDate(ProMfgDate);
		product.setProExpDate(ProExpDate);
		product.setProImage(ProImage);
		int result=ProductDao.save(product);
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("Data inserted Successfully "+result);
	}

}
