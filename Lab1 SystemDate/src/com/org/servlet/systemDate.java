package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class systemDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public systemDate() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date=new Date();  
		PrintWriter out=response.getWriter();
		out.println(date); 
	}
}
