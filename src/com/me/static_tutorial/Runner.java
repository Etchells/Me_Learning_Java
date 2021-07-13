package com.me.static_tutorial;

public class Runner {

	public static void main(String[] args) {
		
	    Person chris = new Person("Chris","Blue");
	    Person tom = new Person("Tom","Brown");

	    System.out.println(Person.numberOfPeople);
		
	    
	    Person stephan = new Person("Stephan","Greenish-Brownish-Blueish");

	    System.out.println(Person.numberOfPeople);
	    
	}
	
	
}
