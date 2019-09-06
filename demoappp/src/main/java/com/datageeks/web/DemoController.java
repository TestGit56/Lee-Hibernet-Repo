package com.datageeks.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class DemoController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.println("<h1> Well come to Demo controller </h1>");
			
			out.close();
			

	}

}