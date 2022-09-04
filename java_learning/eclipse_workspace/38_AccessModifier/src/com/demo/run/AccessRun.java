package com.demo.run;

import com.demo.access.Access;

public class AccessRun {

	public static void main(String[] args) {
		
		Access acs = new Access();
		acs.getDef();                       // Default Variable is accessible via method outside same package  
		acs.getPri();                       // Private Variable need to be accessed via method only outside or inside same package
		System.out.println(acs.pub);        // Public Variable Can be access directly outside or inside same package
		acs.getProt() ;                     // Protected Variable is accessible via method outside same package 
		

	}

}
