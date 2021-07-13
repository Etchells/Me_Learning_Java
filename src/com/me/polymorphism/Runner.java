package com.me.polymorphism;

public class Runner {

	public static void main(String[] args) {
				
//		Cow cow = new Cow();
		
//		Animal animal = new Cow();
		
//		Object object = new Cow();
		
		
		
        System.out.println("=============Cow=============");
        Cow cow = new Cow();
        cow.speak();
        cow.sleep();
        System.out.println("=============================");
		
        System.out.println("\n");
        
        System.out.println("============Animal===========");
        Animal animal = new Cow();
        ((Cow) animal).speak();		//pulling speak from cow (CASTING)
        animal.sleep();
        System.out.println("=============================");
        
        System.out.println("\n");
        
        System.out.println("============Object===========");
        Object object = new Cow();
        ((Cow) object).speak();
        ((Cow) object).sleep();
        System.out.println("=============================");
        
	}
	
	
}
