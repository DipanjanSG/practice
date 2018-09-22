package com.lgi.ui.testAction;

import java.sql.Connection;


import java.sql.DriverManager;



public class DbConnection {

	
	static Connection con1=null;
	static Connection con2=null;
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			
					
			try{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			DbConnection.con1 = DriverManager.getConnection("jdbc:mysql://172.30.149.37:3306/OTL_TOOLBOX","automationuser","Abcd@1234");

			
			System.out.println("Connection:"+con1);

			}catch(Exception ex){
			System.out.println("Message:"+ex.getMessage());
		}
		finally {
			try{
				
				if(con1!=null) con1.close(); 
				if(con2!=null) con2.close();
				System.out.println("Connection closed");
			}catch(Exception ex){
				System.out.println("Class:"+new Object(){}.getClass().getEnclosingClass().getName()+ ", Method:" + new Object() {
				}.getClass().getEnclosingMethod().getName() + ", Message:" + ex.getMessage());
			}
		}
			
		
	}

}
