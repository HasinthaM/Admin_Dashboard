package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class adminDBUtil {
	
	public static List<administrator> validate(String aUsereName, String aPassword) {
		ArrayList<administrator> ad = new ArrayList<administrator>();
		
		String url ="jdbc:mysql://localhost:3306/administrator";
		String user = "root";
		String pass = "Hasi@2000";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stat = con.createStatement();
			
			String sql = "selct * from administrator where username='"+aUsereName+"' and password='"+aPassword+"'";
			
			ResultSet rs = stat.executeQuery(sql);
			
			if(rs.next()) {
				 int aID = rs.getInt(1);
				 String aFirstName = rs.getString(2);
				 String aLastName = rs.getString(3);
				 String aUserU = rs.getString(4);
				 String aEmail = rs.getString(5);
				 String aPassU = rs.getString(6);
				 String aPhoneNo = rs.getString(7);
				 
				 administrator a = new administrator(aID,aFirstName,aLastName,aUserU,aEmail,aPassU,aPhoneNo);
				 ad.add(a);
			}
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		return ad;
	}
}
