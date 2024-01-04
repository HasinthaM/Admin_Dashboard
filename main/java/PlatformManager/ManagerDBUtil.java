package platformManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ManagerDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String uName,String uPass) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from platform_manager where mUserName ='"+uName+"' and mPassword ='"+uPass+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;				
			}else{
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Manager> getManager(String userName){
		
		ArrayList<Manager> manager = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from platform_manager where mUserName ='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int mID = rs.getInt(1);
				String mFirstName = rs.getString(2);
				String mLastName = rs.getString(3);
				String mUserName1 = rs.getString(4);
				String mEmail = rs.getString(5);
				String mPassword1 = rs.getString(6);
				String mPhoneNo = rs.getString(7);
				
				Manager m = new Manager(mID,mFirstName,mLastName,mUserName1,mEmail,mPassword1,mPhoneNo);				
				manager.add(m);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return manager;
	}

	public static boolean UpdateManager(String id, String firstName, String lastName, String userName, String email, String password, String phone) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update platform_manager set mFirstName='"+firstName+"', mLastName='"+lastName+"', mUserName='"+userName+"', mEmail='"+email+"', mPassword='"+password+"', mPhoneNo='"+phone+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}

	public static List<Manager> getManagerDetails(String id) {
		
		int convertedID = Integer.parseInt(id);
		
		ArrayList<Manager> man = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from platform_manager where mID='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int Id = rs.getInt(1);
				String fName = rs.getString(2);
				String lName = rs.getString(3);
				String username = rs.getString(4);
				String email = rs.getString(5);
				String password = rs.getString(6);
				String phone = rs.getString(7);
				
				Manager m = new Manager(Id,fName,lName,username,email,password, phone);
				man.add(m);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return man;
	}	
	
	public static boolean DeleteManager(String id) {
		
		int convID = Integer.parseInt(id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from platform_manager where mID='"+convID+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
public static boolean insertmanager( String fname, String lname, String username, String email, String password, String phone) { 
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into platform_manager values ( 0,'"+fname+"', '"+lname+"', '"+username+"', '"+email+"', '"+password+"', '"+phone+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}


}