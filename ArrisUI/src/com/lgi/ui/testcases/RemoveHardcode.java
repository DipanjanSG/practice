package com.lgi.ui.testcases;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;

public class RemoveHardcode {

	public static void main(String[] args) {
		String[] name = { "WPS", "WirelessSignal", "WirelessSecurity", "UPnP", "Tools", "PortTriggering",
				"PortForwarding", "ModemMode", "MACFiltering", "IPAndPortFiltering", "Home", "GuestNetwork", "Firewall",
				"DMZ", "DHCP", "ConnectedDevices","Admin" };
		String src = "log.info(\"Test Case:";
		String path=null;
		String add = "\t\tlog.info(\"Test Case: \"+ new Object(){}.getClass().getEnclosingMethod().getName());";
		for(int i=0; i<name.length;i++){
			
			path = "C://SourceCode-Mercury//MercuryUIAut//src//com//lgi//ui//testcases//" + name[i] + ".java";
			System.out.println(path);
			editFile(src, add, path);
		}


	}

	public static void editFile(String searchString, String addString, String pathString) {

		try {

			ArrayList<String> fileList = new ArrayList<String>();
			// C://SourceCode-Mercury//MercuryUIAut//src//com//lgi//ui//testcasesAdmin.java
			BufferedReader fileRead = new BufferedReader(new FileReader(pathString));
			String line = "";
			String newLine = "\n";

			while ((line = fileRead.readLine()) != null) {

				if (line.contains(searchString)) {
					if (line.contains("//"))
						fileList.add("//" + addString);
					else
						fileList.add("//" + addString);

				} else {
					fileList.add(line);
				}

			}
			FileOutputStream fileWrite = new FileOutputStream(pathString);
			for (String str : fileList) {
				fileWrite.write(str.getBytes());
				fileWrite.write(newLine.getBytes());

			}

			fileRead.close();
			fileWrite.close();
		} catch (Exception e) {
			System.out.println("Message: " + e.getMessage());

		}

	}

}
