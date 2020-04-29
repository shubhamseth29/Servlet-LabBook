package com.training.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.training.dao.DaoClass;
import com.training.model.TrainingModel;

public class TrainingService {
	
	
	public static ArrayList<TrainingModel> getDetails() throws ClassNotFoundException {
		 ArrayList<TrainingModel> list=new ArrayList<TrainingModel>(); 
		  try{  
	            Connection con=DaoClass.getConnection();  
	            Statement stmt=con.createStatement();  
	            ResultSet rs=stmt.executeQuery("select * from Training");  
	            while(rs.next()){  
	            	TrainingModel tm=new TrainingModel();  
	                tm.setTraining_id(rs.getInt(1));  
	                tm.setTraining_name(rs.getString(2));  
	                tm.setAvailable_seats(rs.getInt(3));  
	                list.add(tm);  
	            }  
	            con.close();
	}
		  catch(Exception e) {
			  
		      System.out.println(e);}  
	      
		  return list;

}
}
