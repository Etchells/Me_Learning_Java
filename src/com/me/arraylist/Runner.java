package com.me.arraylist;

import java.util.ArrayList;

public class Runner {

		
	public static void main(String[] args) {
		
		
//		create a new ArrayList
		ArrayList<String> shoppingList = new ArrayList<>();
		
//		add() several elements
		shoppingList.add("Gin");
		shoppingList.add("Tonic");
		shoppingList.add("Chrips");
		shoppingList.add("Milk");
		shoppingList.add("Tea Bags");
		shoppingList.add("Peppers");
		shoppingList.add("Bread");
		
//		print out the entire ArrayList
		System.out.println(shoppingList);// just to see inside of array
		
//		iterate through the ArrayList and print out each element 
//		(with both normal and enhanced for-loops)
		
//		for (int i = 0; i <= shoppingList.length-1; i++) {
//			System.out.println(shoppingList[i]);
//		}
		
//		for(String x: shoppingList.split(" ")) System.out.println(x);
		
		for(String tempVal: shoppingList) {
			System.out.println(tempVal);
		}
	}
	
	
	
}
