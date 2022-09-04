package com.person;

public class Person {

	private PersonDetails prdt;

	public Person(PersonDetails prdt) {
		this.prdt = prdt;
	}

	public void run() {
		System.out.println( "Person [firstname=" + prdt.getFirstname() + "]" + "[lastname=" + prdt.getLastname() + "]"
				+ "[age=" + prdt.getAge() + "]" + "[gender=" + prdt.getGender() + "]" );
	}
	
	
	
}
