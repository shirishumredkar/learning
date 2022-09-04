package com.person;

public class PersonDetails {

	private String firstname;
	private String lastname;
	private int    age;
	private char   gender;
	
	public PersonDetails(String firstname, String lastname, int age, char gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}
	
		
}
