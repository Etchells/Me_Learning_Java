package com.me.exceptions;

import java.util.Scanner;

public class CrazyWithZeros {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		int a;
		int b;
		
		try {
		
		System.out.println("Enter your first number:");
		a = scan.nextInt();
		System.out.println("Enter your second number:");
		b = scan.nextInt();
		System.out.println("The answer is: " + divideTheseNumbers(a, b));
		}
		catch (Exception e) {
			System.out.println("Tried twice, still didn't work!");
		}
		

	}

	public static int divideTheseNumbers(int a, int b) throws Exception {
		int c;
		try
		{
			c = a / b;
			System.out.println("It worked!");
			
		}
		catch (Exception e)
		{
			System.out.println("Didn't work the first time.");
			c = a / b;
			System.out.println("It worked the second time!");
		}
		finally
		{
			System.out.println("Better clean up my mess.");
		}
		System.out.println("It worked after all.");
		return c;
	}
	
}
