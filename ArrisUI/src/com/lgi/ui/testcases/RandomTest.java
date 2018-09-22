package com.lgi.ui.testcases;

import java.util.ArrayList;
import java.util.List;

public class RandomTest {
	
	public static void main(String[] args) {
		
		

		
		
		String  s="html/body/div[9]/div[1]/ul/li[4]/ul/li[2]/a";
		s=s.replace("4", "3");
		System.out.println(s);
	}
	
	public List returnArray(int v_itr7_status){
		List list = new ArrayList<>();
		
		
		String v_status = null;
		String v_domestic_flg = null;
		int v_form_name = 0;
		if(v_itr7_status==1) {
			v_form_name = 4;
			v_status = "I";
			v_domestic_flg = "X" ;
			
			}
			else if (v_itr7_status==2){
			v_form_name =4;
			v_status = "H" ;
			v_domestic_flg = "X" ;
			}
			else if (v_itr7_status==3){
			v_form_name = 6 ;
			v_status = "6" ;
			v_domestic_flg = "Y" ;
			}
			else if (v_itr7_status==4){
			v_form_name = 6;
			v_status = "6" ;
			v_domestic_flg = "N" ;
			}
			else if (v_itr7_status==5){
			v_form_name = 5;
			v_status = "1" ;
			v_domestic_flg = "X" ;
			}
			else if (v_itr7_status==6 || v_itr7_status==7 || v_itr7_status==8){
			v_form_name = 5;
			v_status ="6" ;
			v_domestic_flg = "X" ;
			}
			else if (v_itr7_status==9){
			v_form_name= 5;
			v_status ="4" ;
			v_domestic_flg = "X" ;
			}
			else if (v_itr7_status==10) {
			v_form_name = 5;
			v_status = "2" ;
			v_domestic_flg = "X" ;
			}
		list.add(v_form_name);
		list.add(v_status);
		list.add(v_domestic_flg);
		
		
		return list;
	}

}
