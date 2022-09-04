package com.demo.access;

public class AccessSame {

public static void main(String[] args) {
	Access acs = new Access();
	System.out.println(acs.def); // Scope of Default variable is within same package & can be access directly
	acs.getPri();                // Private Variable need to be accessed via method only outside or inside same package
	System.out.println(acs.pub); // Public Variable Can be access directly outside or inside same package
	System.out.println(acs.prot);// Protected Variable is accessible in same package directly
	
}
}
