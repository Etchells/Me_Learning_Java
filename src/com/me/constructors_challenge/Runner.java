package com.me.constructors_challenge;

import java.util.ArrayList;


public class Runner {


	public static void main(String[] args) {
		
		// Instance of Person
		Person p = new Person();
		
		
		Person glenn = new Person("Glenn Etchells", 42, "Software Engineer");
		Person lisa = new Person("Lisa Etchells", 42);
		Person rita = new Person("Rita Etchells");
		
		// Checking output
//		System.out.println(glenn);
//		System.out.println(lisa);
//		System.out.println(rita);
		
		
		// Create a List<> implementation and store those objects inside.
//		ArrayList<Person> listOfPerson = new ArrayList<>();
		// Will get a red underscore error on Array indicating to import ArrayList
		
		// Adding Instances to ArrayList
//		listOfPerson.add(glenn);
//		listOfPerson.add(lisa);
//		listOfPerson.add(rita);
		p.addToList(glenn);
		
		
		p.printAll();
		
		// Printing ArrayList
//		for (Person aPerson:listOfPerson) {
//			System.out.println(aPerson);
//		}		
		
		// Create a method that can search for a specific Person by their name.
//		System.out.println(p.search("Glenn Etchells"));
		
//		String searchName = "Glenn Etchells";
//		
//		for(int i = 0; i < listOfPerson.size(); i++) {
//			System.out.println(list.get(i));
//			
//			if(searchName==listOfPerson.get(i)) {
//{	
//				System.out.println("Name found");
//				
//				break;
//				
//			}
//
//		}
	
//		for(Person element:listOfPerson) {
//			if (element.contains("Glenn Etchells")) {
//				System.out.println(element);			        
//			}
//			
//		}
//		
//		
//		
//		
//		String name = "Glenn Etchells";
//		if(listOfPerson.contains(name)) {
//			System.out.println("Yes");
//		}
		
		
		
		
//		String nameToFind ="Glenn Etchells";
//		
//		
//		
//	}
//	private void nameToFind(String nameToFind) {
//		if(listOfPerson.contains(nameToFind)) {
//			System.out.println("found");
//		}else {
//			System.out.println("not found");
//		}
//	}
	
}
}

