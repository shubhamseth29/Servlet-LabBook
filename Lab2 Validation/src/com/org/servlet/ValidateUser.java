package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ValidateUser() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String _usernamenm=request.getParameter("Uname");
		String pass=request.getParameter("pwd");
		if((_username.equals("Vaibhav"))&&(pass.equals("qwerty"))) {
			RequestDispatcher rdValid=request.getRequestDispatcher("/Success.html");
			rdValid.forward(request, response);
	}
	else {
        out.print("Sorry username or password is incorrect");  
		RequestDispatcher rdFail=request.getRequestDispatcher("/Login.html");
		rdFail.include(request, response);
	}
	}
}
