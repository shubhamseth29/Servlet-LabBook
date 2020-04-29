package com.training.enrollment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.* ;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.TrainingModel;
import com.training.service.TrainingService;

@WebServlet("/ViewTable1")
public class ViewTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		
		try {
			ArrayList<TrainingModel> list = TrainingService.getDetails();;		 
	            out.print("<table border=1>");
	 			out.print("<tr>");
	 			out.print("<td>Training Id</td>"); 
	 			out.print("<td>Training Name</td>"); 
	 			out.print("<td>Avalaible Seats</td>"); 
	 			out.print("<td>Enroll in training</td>"); 
	 			out.print("</tr>");  
	 			
	 			for(int j=0;j<list.size();j++) {
	 			    	out.print("<tr>") ;
	 					out.print("<td>"+list.get(j).getTraining_id()+"</td>");
	 					out.print("<td>"+list.get(j).getTraining_name()+"</td>");
	 					out.print("<td>"+list.get(j).getAvailable_seats()+"</td>");
	 					out.print("<td><a href='Enrollment?trainid="+list.get(j).getTraining_id()
																 +list.get(j).getTraining_name()
																+list.get(j).getAvailable_seats()
																+"'>Enroll</a>"+  "</td>");

	 					
	 				}
	 			
	    }  
		catch (Exception e) {
			
			e.printStackTrace();
		}

 
     out.print("</table>") ;
	}}
	
	

 //protected
