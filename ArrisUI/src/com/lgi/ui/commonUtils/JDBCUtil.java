package com.lgi.ui.commonUtils;

import java.io.FileInputStream;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import org.apache.log4j.Logger;

public class JDBCUtil {
	private static InputStream fis = null;
	private static Properties prop = new Properties();
	private static Logger log = null;

	static String clas = new Object() {
	}.getClass().getEnclosingClass().getName();

	private JDBCUtil() {

	}

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			fis = new FileInputStream("testSetup.properties");
			prop.load(fis);

		} catch (Exception ex) {
			log = Driver.getLogger();
			log.info("Class: " + clas + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
					+ ", Supporting Message: Exception occured while configuring the MYSQL connection.");
		}
	}

	// Connect to DataBase
	public static Connection getMysqlConnection() throws SQLException 
	{

		
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Connection con = null;
		String url = prop.getProperty("DatabaseURL");
		System.out.println("Connecting to " +url);
		int i = 1;
		while (i <= 10) 
		{

			try 
			{
				con = DriverManager.getConnection(url, prop.getProperty("DBusername"), prop.getProperty("DBpassword"));
				System.out.println("Database connection successful");
				break;
			} 
			catch (Exception e) {
				System.out.println("Class: " + clas + ", Method: " + method + ", Message: "
						+ ", Supporting Message: DB Connection failed. Trying again.." + i);
				e.printStackTrace();
				i++;
			}
		}

		return con;
	}

	public static void cleanup(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
			System.out.println("Database connection closed");
		} catch (Exception ex) {
			log.info("Class: " + clas + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
					+ ", Supporting Message: Exception occured while closing the MYSQL connection.");
		}
	}

}
