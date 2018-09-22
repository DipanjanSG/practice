package com.lgi.ui.automationJar;

import java.io.IOException;

import java.io.InputStream;
import java.io.PrintWriter;
import com.lgi.ui.commonUtils.*;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class ResetPassword
{
	
	  public void ResetPasswordLanOrWan(String network) 
         {
        	  System.out.println("**********RESETTING PASSWORD****************");
        	  String str=new String();
        	  if(network=="wan")
        		  str="snmpset -v2c -c private "+Driver.parsingCSVFile("CMIPAddress")+" "+".1.3.6.1.4.1.4115.1.20.1.1.5.16.1.3.2 s "+Driver.parsingCSVFile("ModemFirstTimePassword");
        	  else if(network=="lan")
        		  str="snmpset -v2c -c private "+Driver.parsingCSVFile("CMIPAddress")+" "+".1.3.6.1.4.1.4115.1.20.1.1.5.16.1.3.1 s "+"Mercury1234";
        	  else if(network=="FirstTimePassword")
        		  str="snmpset -v2c -c private "+Driver.parsingCSVFile("CMIPAddress")+" "+".1.3.6.1.4.1.4115.1.20.1.1.5.16.1.3.1 s "+Driver.parsingCSVFile("ModemFirstTimePassword");

			  String host=Driver.parsingCSVFile("HostName");
			  String user=Driver.parsingCSVFile("PasswordResetServerUser");
			  String password=Driver.parsingCSVFile("PasswordResetSeverPassword");
			  String command=str;
			  System.out.println("Server IP Address : "+host);
			  System.out.println("Username : "+user);
			  System.out.println("Password :"+password);
			  System.out.println(str);

			  try
			  {
			     
			     java.util.Properties config = new java.util.Properties(); 
			     config.put("StrictHostKeyChecking", "no");
			     JSch jsch = new JSch();
			     Session session=jsch.getSession(user, host, 22);
			     session.setPassword(password);
			     session.setConfig(config);
			     session.connect();
			     System.out.println("Connected");
			     
			     Channel channel=session.openChannel("exec");
			     ((ChannelExec)channel).setCommand(command);
//                   ((ChannelExec)channel).setCommand(command1);
			  
			      channel.setInputStream(null);
			      ((ChannelExec)channel).setErrStream(System.err);
			      
			      InputStream in=channel.getInputStream();
			      channel.connect();
			      
			      byte[] tmp=new byte[1024];
			      while(true){
			        while(in.available()>0){
			          int i=in.read(tmp, 0, 1024);
			          if(i<0)break;
			          try{
			            System.out.print(new String(tmp, 0, i));
			              PrintWriter writer = new PrintWriter("C:\\Users\\raju.shanigarapu\\Desktop\\a.txt", "UTF-8");
			              writer.println(new String(tmp,0,i));
			              writer.close();
			          } catch (IOException e) {
			             // do something
			          }
			         
			        }
			        if(channel.isClosed()){
			          System.out.println("exit-status: "+channel.getExitStatus());
			          break;
			        }
			        try{Thread.sleep(1000);}catch(Exception ee){}
			      }
			      channel.disconnect();
			      session.disconnect();
			     
			  }
			  catch(Exception e){
			     e.printStackTrace();
			  }
         
			  System.out.println("**********PASSWORD RESET****************");
         
       }
}

