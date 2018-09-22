package com.lgi.ui.automationJar;

import java.io.IOException;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.io.PrintWriter;
import com.lgi.ui.commonUtils.*;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class ModemFactoryReset {
	Logger log = Driver.getLogger();
	public void FactoryResetModem() {
		log.info("**********************************STARTED FACTORY RESET******************************");

		String mfrc = "snmpset -c private -v2c";   //Driver.parsingCSVFile("ModemFactoryResetCommand");
		String cmip = Driver.parsingCSVFile("CMIPAddress");
		String mfrm = ".1.3.6.1.4.1.4115.1.20.1.1.5.5.0 i 3";//Driver.parsingCSVFile("ModemFactoryResetMib");
		String host = "172.30.144.226";//Driver.parsingCSVFile("ModemFactoryResettServer");
		String user = "tftpuser";//Driver.parsingCSVFile("ModemFactoryResetUser");
		String password = "tftpuser";//Driver.parsingCSVFile("ModemFactoryResetrPassword");
		String command = mfrc + " " + cmip + " " + mfrm;
		System.out.println(command);
		System.out.println(host);
		System.out.println(user);
		System.out.println(password);
		try {

			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			Session session = jsch.getSession(user, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Connected");

			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);
			// ((ChannelExec)channel).setCommand(command1);

			channel.setInputStream(null);
			((ChannelExec) channel).setErrStream(System.err);

			InputStream in = channel.getInputStream();
			channel.connect();

			byte[] tmp = new byte[1024];
			while (true) {
				/*while (in.available() > 0) {
					System.out.println(in.toString());
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;
					try {
						System.out.print(new String(tmp, 0, i));
						PrintWriter writer = new PrintWriter("C:\\Users\\madhu_s10\\Desktop\\a.txt", "UTF-8");
						writer.println(new String(tmp, 0, i));
						writer.close();
					} catch (IOException e) {
						// do something
					}

				}*/
				if (channel.isClosed()) {
					System.out.println("exit-status: " + channel.getExitStatus());
					Thread.sleep(480 * 1000);
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception ee) {
				}
			}
			channel.disconnect();
			session.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("**********************************COMPLETED FACTORY RESET****************************");

	}
}
