package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import platformManager.DBConnect;

public class adminDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	// Method for validating admin credentials
	public static List<administrator> validate(String uName, String uPass) {
		ArrayList<administrator> ad = new ArrayList<administrator>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "select * from administrator where aUserName='" + uName + "' and aPassword='" + uPass + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int aID = rs.getInt(1);
				String aFirstName = rs.getString(2);
				String aLastName = rs.getString(3);
				String aUserU = rs.getString(4);
				String aEmail = rs.getString(5);
				String aPassU = rs.getString(6);
				String aPhoneNo = rs.getString(7);

				administrator a = new administrator(aID, aFirstName, aLastName, aUserU, aEmail, aPassU, aPhoneNo);
				ad.add(a);
			}

		}

		catch (Exception e) {
			System.out.println(e);

		}

		return ad;
	}

	// Method for updating admin account information
	public static boolean updateadmin(String id, String firstname, String lastname, String Username, String Email,
			String Password, String phoneno) {

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "update administrator set aFirstName='" + firstname + "' ,aLastName='" + lastname
					+ "' ,aUserName='" + Username + "' ,aEmail='" + Email + "' ,aPassword='" + Password
					+ "' ,aPhoneNo='" + phoneno + "'" + "where aID='" + id + "'";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return isSuccess;
	}

	// Method for getting admin details by ID
	public static List<administrator> getAdminDetails(String Id) {

		int convert = Integer.parseInt(Id);

		ArrayList<administrator> ad = new ArrayList<>();

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "Select * from administrator where aID='" + convert + "'";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int aID = rs.getInt(1);
				String aFirstName = rs.getString(2);
				String aLastName = rs.getString(3);
				String aUserName = rs.getString(4);
				String aEmail = rs.getString(5);
				String aPassword = rs.getString(6);
				String aPhoneNo = rs.getString(7);

				administrator ads = new administrator(aID, aFirstName, aLastName, aUserName, aEmail, aPassword,
						aPhoneNo);
				ad.add(ads);

			}

			
			//Exception
		} catch(SQLException e){
			System.out.println(e);
			
		}	
		
		catch (Exception e) {
		
			System.out.println(e);
		}

		return ad;
	}

	// Method for deleting an admin account by ID
	public static boolean deleteadminaccount(String id) {
		int convert = Integer.parseInt(id);

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from administrator where aID='" + convert + "'";
			int d = stmt.executeUpdate(sql);

			if (d > 0) {
				isSuccess = true;

			} else {
				isSuccess = false;

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return isSuccess;

	}

}
