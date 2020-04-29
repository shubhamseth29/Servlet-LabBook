package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoClass {

	
	public static Connection getConnection() throws ClassNotFoundException{
		Connection con= null ;
		
		  Class.forName("oracle.jdbc.driver.OracleDriver");
          try {
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","pass");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con ;
		
	}
}
