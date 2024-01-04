package platformManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String url = "jdbc:mysql://localhost:3306/video_browsing"; 
	private static String uName = "root";
	private static String uPass = "Hasi@2000";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, uName, uPass);
			
		}catch(Exception e) {
			System.out.println("Database connection is not success!!");
		}
		
		return con;
	}
}
