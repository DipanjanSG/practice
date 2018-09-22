package com.lgi.ui.testcases;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class PuttyTest {
	public static void main(String[] args) {
		Session session = null;
		Channel channel = null;
		String actual = "File is downloaded";
		int countConnectionTrail = 0;
		Integer countConnectionTry = 0;
		String msg = "";
		try {

			String commandLine = "tftp -4 -v 10.15.168.48 -c get TFTPSAMPLE.txt";
			System.out.println("Command:" + commandLine);

			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();

			/*
			 * Here we are connecting to the development server via putty
			 * session
			 */
			session = jsch.getSession("administrator", "10.64.12.129", 22);
			session.setPassword("automation@123");
			session.setConfig(config);
			session.connect();

			System.out.println("Putty session established");

			channel = session.openChannel("exec");

			BufferedReader in = new BufferedReader(new InputStreamReader(channel.getInputStream()));

			((ChannelExec) channel).setCommand(commandLine);

			while (countConnectionTrail < 60) {
				channel.connect();
				if (channel.isConnected()) {
					System.out.println("channel is connected in "+countConnectionTrail+" trials");
					break;
				} else
					Thread.sleep(1 * 1000);
				countConnectionTrail++;
				System.out.println(
						"Not able to connect to the channel, Channel connection trial:" + countConnectionTrail);
			}

			while ((msg = in.readLine()) != null) {

				System.out.println(msg);

				if (msg.contains(actual)) {

					System.out.println("Command line response:" + msg);

					break;
				} else {
					if (msg.contains("Retrying")) {
						countConnectionTry++;
						System.out.println("Count for connection try:" + countConnectionTry);
					}
					System.out.println("Expected response:" + actual + " is not found after the command");
					if (countConnectionTry >= 5) {
						System.out.println("Exceeded No of trials for connection after executing the command");
						break;
					}
				}
			}

		} catch (Exception e) {

		}
		channel.disconnect();
		if (channel.isClosed()) {
			System.out.println("exit-status: " + channel.getExitStatus());
			// break;
		}

		session.disconnect();

	}

}
