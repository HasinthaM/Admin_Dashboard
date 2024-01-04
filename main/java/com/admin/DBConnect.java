package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	//Inheritance
	// Database connection details
	private static String url = "jdbc:mysql://localhost:3306/video_browsing";
	private static String uName = "root";
	private static String uPass = "Hasi@2000";
	private static Connection con;
	
	// Method to establish a database connection
	public static Connection getConnection() {
		
		try {
			
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.jdbc.Driver");	
			
			// Establish a connection to the database
			con = DriverManager.getConnection(url, uName, uPass);
			
		}
		catch(Exception e) {
			System.out.println("Database connection is not success!!");
		}
		return con;
		
	}

}
