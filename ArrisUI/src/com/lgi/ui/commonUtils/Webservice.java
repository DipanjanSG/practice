package com.lgi.ui.commonUtils;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.commonUtils.JDBCUtil;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

public class Webservice {
	static Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ResultSetMetaData rsmd = null;

	FileOutputStream fileOut;
	POIFSFileSystem fs;

	HSSFWorkbook wb;
	HSSFSheet sheet;

	private static Logger log = null;
	private static FileInputStream fis = null;
	private static Properties prop = new Properties();

	static String clas = new Object() {
	}.getClass().getEnclosingClass().getName();

	static {

		try {
			log = Driver.getLogger();
			fis = new FileInputStream("testSetup.properties");
			prop.load(fis);

		} catch (IOException ex) {
			log.info("Class: " + clas + ", Static Block, Message:" + ex.getMessage());
		}
	}

	public static List<Object> features = null;// new ArrayList<>();
	public static List<String> dateKeys = null;// new ArrayList<>();
	public static List<String> references = null;// new ArrayList<>();

	public boolean getDatabaseTable(String model_name) throws IOException {

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		boolean dbres = false;
		try {
			con = JDBCUtil.getMysqlConnection();

			dbres = getWebPrerequisitesTable(model_name);
			dbres = getWebModemTable(model_name);

		} catch (SQLException e) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + e.getMessage()
					+ ", Supporting Message: DB Connection failed. Run Aborted");
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}

		return dbres;
	}

	// Get DB table -WebPrerequisistes
	public boolean getWebPrerequisitesTable(String model_name) throws IOException {


		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		wb = new HSSFWorkbook();
		sheet = wb.createSheet("WebPrerequisites");
		HSSFRow rowhead = sheet.createRow((short) 0);

		try {
			ps = con.prepareStatement("select * from Web_Prerequisites_LAB where model_name=?");

			ps.setString(1, model_name);
			rs = ps.executeQuery();

			rowhead.createCell((short) 0).setCellValue("Test case");
			rowhead.createCell((short) 1).setCellValue("Feature");
			rowhead.createCell((short) 2).setCellValue("dataKey");
			rowhead.createCell((short) 3).setCellValue("references");

			int index = 1;
			while (rs.next()) {

				HSSFRow row = sheet.createRow((short) index);
				row.createCell((short) 0).setCellValue(rs.getString(3));
				row.createCell((short) 1).setCellValue(rs.getString(4));
				row.createCell((short) 2).setCellValue(rs.getString(6));
				row.createCell((short) 3).setCellValue(rs.getString(7));

				index++;
			}
		} catch (SQLException e) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + e.getMessage());
			e.printStackTrace();
			return false;
		}

		try {
			fileOut = new FileOutputStream(prop.getProperty("pathWebPrerequisites"));
			wb.write(fileOut);
			wb.close();
			fileOut.close();

		} catch (FileNotFoundException e) {
			log.info("Class: " + clas + ", Method: " + method + ", Message: " + e.getMessage());
			e.printStackTrace();
			return false;
		}

		// System.out.println("Web_Prerequisites data is saved in xls file.");
		return true;
	}

	// Get DB table -WebModem
	public boolean getWebModemTable(String model_name) throws IOException {

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		wb = new HSSFWorkbook();
		sheet = wb.createSheet("WebModem");
		HSSFRow rowhead = sheet.createRow((short) 0);

		try {

			ps = con.prepareStatement("select feature_name, web_object_type, web_object_action, "
					+ Driver.firmwareVersionColumnName + ", error_message from " + model_name);

			rs = ps.executeQuery();

			rowhead.createCell((short) 0).setCellValue("Feature");
			rowhead.createCell((short) 1).setCellValue("Web Object Type");
			rowhead.createCell((short) 2).setCellValue("Web Object Action");
			rowhead.createCell((short) 3).setCellValue("Xpath");
			rowhead.createCell((short) 4).setCellValue("Error Message");

			int index = 1;
			while (rs.next()) {

				HSSFRow row = sheet.createRow((short) index);
				row.createCell((short) 0).setCellValue(rs.getString(1));
				row.createCell((short) 1).setCellValue(rs.getString(2));
				row.createCell((short) 2).setCellValue(rs.getString(3));
				row.createCell((short) 3).setCellValue(rs.getString(4));
				row.createCell((short) 4).setCellValue(rs.getString(5));

				index++;
			}
		} catch (SQLException e) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + e.getMessage());
			e.printStackTrace();
			return false;
		}

		try {
			fileOut = new FileOutputStream(prop.getProperty("pathWebModem"));
			wb.write(fileOut);
			wb.close();
			fileOut.close();

		} catch (FileNotFoundException e) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + e.getMessage());
			e.printStackTrace();
			return false;
		}

		// System.out.println("Web_Modem data is saved in xls file.");
		return true;
	}

	// Gets all features and corresponding datakey of a testcase
	public void getFeatures(String model_name, String test_case) {

		features = new ArrayList<>();
		dateKeys = new ArrayList<>();
		references = new ArrayList<>();

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();
		//log.info(test_case + model_name);
		try {
			fs = new POIFSFileSystem(new FileInputStream(prop.getProperty("pathWebPrerequisites")));
			wb = new HSSFWorkbook(fs);
			sheet = wb.getSheetAt(0);

			int nRow = sheet.getLastRowNum();

			Row row;
			Cell cell0, cell1, cell2, cell3;
			for (int i = 0; i <= nRow; i++) {
				row = sheet.getRow(i);
				cell0 = row.getCell(0);
				//log.info(cell0.getStringCellValue());
				if (cell0 != null) {

					if (cell0.getStringCellValue().equalsIgnoreCase(test_case)) {

						cell1 = row.getCell(1);
						cell2 = row.getCell(2);
						cell3 = row.getCell(3);
						//log.info(cell1.getStringCellValue());
						features.add(cell1.getStringCellValue());
						dateKeys.add(cell2.getStringCellValue());
						references.add(cell3.getStringCellValue());
					}
				}
			}

		} catch (IOException e) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + e.getMessage());
			e.printStackTrace();
		}

		return;
	}

	// Gets the type, action and xpath detail of a feature
	public Map<String, Object> getFeatureData(String feature_name) {

		Map<String, Object> hash = new LinkedHashMap<String, Object>();

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		try {

			fs = new POIFSFileSystem(new FileInputStream(prop.getProperty("pathWebModem")));
			wb = new HSSFWorkbook(fs);
			sheet = wb.getSheetAt(0);

			int nRow = sheet.getLastRowNum();

			Row row;
			Cell cell0, cell1, cell2, cell3, cell4;

			for (int i = 0; i <= nRow; i++) {
				row = sheet.getRow(i);
				cell0 = row.getCell(0);

				if (cell0 != null) {

					if (cell0.getStringCellValue().equals(feature_name)) {

						cell1 = row.getCell(1);
						cell2 = row.getCell(2);
						cell3 = row.getCell(3);
						cell4 = row.getCell(4);

						hash.put("web_object_type", cell1.getStringCellValue()); // xpath
																					// or
																					// ID
						hash.put("web_object_action", cell2.getStringCellValue()); // lable,
																					// button,
																					// text
																					// etc
						hash.put("web_object_value", cell3.getStringCellValue()); // exact
																					// xpath
						hash.put("error_message", cell4.getStringCellValue());
					}
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
			log.info("Class: " + clas + ", Method: " + method + ", Message: " + e.getMessage());
		}

		return hash;
	}

	// Gets the coloumn for current firmware version xpaths
	public Map<String, Object> firmwareFunctional(String model_name, String firmwareVersion) {
		Map<String, Object> hash = new LinkedHashMap<String, Object>();
		ArrayList<String> fVersions = new ArrayList<String>();

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		try {
			con = JDBCUtil.getMysqlConnection();

			try {

				// Get all available firmware versions for gateway
				ps = con.prepareStatement("select firmware_version from Web_Firmware where model_name=?");
				ps.setString(1, model_name);
				rs = ps.executeQuery();

				while (rs.next()) {
					fVersions.add(rs.getString(1));
				}

				// Check current version in available versions
				// If its not there, it will be added
				if (fVersions.contains(firmwareVersion)) {
					ps = con.prepareStatement(
							"select model_name,column_name from Web_Firmware where model_name=? and firmware_version=?");
					ps.setString(1, model_name);
					ps.setString(2, firmwareVersion);

					rs = ps.executeQuery();

					if (rs.next()) {
						hash.put("model_name", rs.getString(1));
						hash.put("column_name", rs.getString(2));
					}

				} else {
					System.out.println("\nVersion is not found. Creating a new coulmn to DB for this version");

					String columnName = null;
					String lastColumn = null;
					int numOfCol = 0;
					columnName = "web_object_value_" + firmwareVersion;

					String xPathTable = runAut.modem;

					// Getting the total no. of columns
					ps = con.prepareStatement("select * from " + xPathTable);

					rs = ps.executeQuery();
					rsmd = (ResultSetMetaData) rs.getMetaData();

					numOfCol = rsmd.getColumnCount();

					// Getting the all column names
					ps = con.prepareStatement(
							"select column_name from information_schema.columns where table_name = ?");
					ps.setString(1, xPathTable);

					rs = ps.executeQuery();

					for (int i = 1; rs.next(); i++) {
						if (i == numOfCol)
							lastColumn = rs.getString(1);

					}

					// Adding new column for new xpaths
					ps = con.prepareStatement("ALTER TABLE " + xPathTable + " ADD " + columnName + " varchar(250)");

					try {
						ps.executeUpdate();

						// Copying old xpaths to new column
						ps = con.prepareStatement("UPDATE " + xPathTable + " SET " + columnName + " = " + lastColumn);

						try {
							ps.executeUpdate();

							// Adding row for new version
							ps = con.prepareStatement(
									"INSERT INTO Web_Firmware (model_name, firmware_version, column_name) VALUES (?, ?, ?)");

							ps.setString(1, model_name);
							ps.setString(2, firmwareVersion);
							ps.setString(3, columnName);

							try {
								ps.executeUpdate();

							} catch (SQLException ex) {
								System.out.println("row not added");
							}

						} catch (SQLException ex) {
							System.out.println("xpaths are not copied");
						}

					} catch (SQLException ex) {
						System.out.println("column not created" + ex.getMessage());
					}

					hash.put("model_name", model_name);
					hash.put("column_name", columnName);

				}
			} catch (SQLException ex) {

				System.out.println("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage());
				log.info("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage());
				System.exit(0);

			}
		} catch (SQLException ex) {

			log.info("Class: " + clas + ", Method: " + method + ", Message: " + ex.getMessage()
					+ ", Supporting Message: DB Connection failed. Run Aborted");

			return null;
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}

		return hash;
	}
}
