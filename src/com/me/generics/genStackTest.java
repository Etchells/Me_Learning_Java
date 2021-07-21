package com.me.generics;

public class genStackTest {

	public static void main(String[] args) {
		
		GenStack<String> gs = new GenStack<String>();
		
		System.out.println("Pushing four items onto the stack. ");
		
		gs.push("One");
		gs.push("Two");
		gs.push("Three");
		gs.push("Four");
		
		System.out.println("There are " + gs.size() + " items in the stack. \n");	//returns number of elements in list
		
		System.out.println("The top item is: " + gs.peek() + "\n");					//returns last element in list
		
		System.out.println("There are still " + gs.size() + "\n");					//returns number of elements in list
		
		System.out.println("Popping everything: ");
		while (gs.hasItems())														//while loop to remove all elements
			System.out.println(gs.pop());
		
		System.out.println("There are now " + gs.size() + " items in the stack \n");//returns number of elements in list
		
		System.out.println("The top item is: " + gs.peek() + "\n");					//returns last element in list which will be empty
	}
	
}
