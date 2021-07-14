package com.me.exceptions;

import java.util.Scanner;



public class Exceptions {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws DivideByZeroException {
		
		Calculator calc = new Calculator();
		
		double num1;
		double num2;
		
		
//		--------------------------------------------------------------
		System.out.println("Enter your first number:");
		num1 = scan.nextDouble();
		System.out.println("Enter your second number:");
		num2 = scan.nextDouble();
		System.out.println("The answer is: " + calc.divide(num1, num2));
//		--------------------------------------------------------------
	
		

		
		
	}
	

	
	
	
	
	

	
	
	
	
	
}

	 
	

