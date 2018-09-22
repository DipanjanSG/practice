package com.lgi.ui.testcases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.lgi.ui.commonUtils.JDBCUtil;
import com.lgi.ui.testAction.TestAction;
import com.mysql.jdbc.ResultSetMetaData;

public class TestLocal {
	public static void main(String[] args) throws IOException {

		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Logger log = null;

		String clas = new Object() {
		}.getClass().getEnclosingClass().getName();

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		try {

			con = DriverManager.getConnection("jdbc:mysql://172.30.47.15:3306/OTL_TOOLBOX", "www-data", "data-www");

		} catch (SQLException ex) {

		System.out.println("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage()
					+ ", Supporting Message: DB Connection failed. Trying again..1");

			return;

		}

		try

		{
			ps = con.prepareStatement("select * from Web_Prerequisites where model_name=?");

			ps.setString(1, "CH7465CE");
			// ps.setString(2, test_case);
			rs = ps.executeQuery();

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("WebPrerequisites");
			HSSFRow rowhead = sheet.createRow((short) 0);

			rowhead.createCell((short) 0).setCellValue("Test case");
			rowhead.createCell((short) 1).setCellValue("Feature");
			rowhead.createCell((short) 2).setCellValue("dataKey");

			int index = 1;
			while (rs.next()) {

				HSSFRow row = sheet.createRow((short) index);
				row.createCell((short) 0).setCellValue(rs.getString(3));
				row.createCell((short) 1).setCellValue(rs.getString(4));
				row.createCell((short) 2).setCellValue(rs.getString(6));
				System.out.println("adding row: "+index);
				index++;
			}
			
			 FileOutputStream fileOut = new FileOutputStream("C:\\WebUIAutomationJar\\WebPrerequisites.xls");
             wb.write(fileOut);
             fileOut.close();
             System.out.println("Data is saved in excel file.");

			
			System.out.println("Done");
			con.close();

		} catch (

		SQLException ex)

		{

			System.out.println("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage());
		//	JDBCUtil.cleanup(rs, ps, con);
		}

		return;

	}
	
	public BufferedReader runCommand(String command) {

		BufferedReader br = null;
		Process pr = null;
		try {
			
			String line = null;
			pr = Runtime.getRuntime().exec(command);
			br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

			System.out.println("***************** " + command + " ******************");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("*****************************************************");

			pr = Runtime.getRuntime().exec(command);

			
			br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage() + ", Supporting Message: "
					+ command + "  could not be executed properlly");
		}

		return br;
	}

	// vikram
	public void getFeatures(String model_name) {

		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		ResultSetMetaData rsmd = null;
		Logger log = null;

		String clas = new Object() {
		}.getClass().getEnclosingClass().getName();

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		List<Object> features = new ArrayList<>();
		List<String> dataKeys = new ArrayList<>();

		try {
			con = JDBCUtil.getMysqlConnection();

		} catch (SQLException ex) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage()
					+ ", Supporting Message: DB Connection failed. Trying again..1");

			try {
				con = JDBCUtil.getMysqlConnection();
			} catch (SQLException ex1) {

				log.info("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage()
						+ ", Supporting Message: DB Connection failed. Trying again..2");

				return;

			}
		}

		try {
			ps = con.prepareStatement("select * from Web_Prerequisites where model_name=?");

			ps.setString(1, model_name);
			// ps.setString(2, test_case);
			rs = ps.executeQuery();

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("c:\\WebUIAutomationJar\\WebPrerequisites.xls");
			HSSFRow rowhead = sheet.createRow((short) 0);

			rowhead.createCell((short) 0).setCellValue("Test case");
			rowhead.createCell((short) 1).setCellValue("Feature");
			rowhead.createCell((short) 2).setCellValue("dataKey");

			int index = 1;
			while (rs.next()) {

				HSSFRow row = sheet.createRow((short) index);
				row.createCell((short) 0).setCellValue(rs.getInt(1));
				row.createCell((short) 1).setCellValue(rs.getString(2));
				row.createCell((short) 3).setCellValue(rs.getInt(4));
				index++;
			}

			con.close();

		} catch (SQLException ex) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage());
			JDBCUtil.cleanup(rs, ps, con);
		}

		return;
	}

	// vikram

}
