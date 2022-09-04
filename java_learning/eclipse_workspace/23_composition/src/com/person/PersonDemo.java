package com.person;

public class PersonDemo {

	public static void main(String[] args) {
		
		PersonDetails prdt = new PersonDetails("Shirish","Umredkar",36,'M');
		Person pr = new Person(prdt);
		
		pr.run();
	}

}
