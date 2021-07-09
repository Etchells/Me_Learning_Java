package com.me.constructors_challenge;

import java.util.ArrayList;

public class Person {

	// Class is a blue print to crate objects
	// Members - Attributes
	public String name;
	public int age;
	public String jobTitle;

	ArrayList<Person> listOfPerson = new ArrayList<>();
	
	// source Generate toString      to stop printing memory location
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}

	// Constructor ALL ARGS CONSTRUCTOR
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	// Overloading - SAME NAME but DIFFERENT Arguments
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Overloading - SAME NAME but DIFFERENT Arguments
	public Person(String name) {
		this.name = name;
	}
	
	// Default constructor
	public Person() {
		
	}
	
	// Getters & Setters
	// Getter
	public String getName() {
		return name;
	}
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	// Getter
	public int getAge() {
		return age;
	}
	// Setters
	public void setAge(int age) {
		this.age = age;
	}
	// Getter
	public String getJobTitle() {
		return jobTitle;
	}
	// Setters
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void addToList(Person p) {
		listOfPerson.add(p);
		System.out.println("Person add " + p);
	}
	
	public void search(String name) {
		for (Person tempPerson : listOfPerson) {
			if(tempPerson.getName()==name) {
				System.out.println(tempPerson);
			}
		}
	}
	public void printAll() {
		for (Person p : listOfPeople)}
	
	
}
