package com.me.input2;

import java.util.Scanner;

public class Calculations {

	public static void calculation() {

		Scanner menuOption = new Scanner(System.in);
		int myOption = menuOption.nextInt();

		switch (myOption) {
		case 1:

			System.out.println("You have chosen to: Add two numbers");
			Scanner scan = new Scanner(System.in);
			System.out.println("Please provide your first number:");
			double number1 = scan.nextDouble();
			System.out.println("Please provide your second number:");
			double number2 = scan.nextDouble();
			System.out.println("The answer is: " + (number1 + number2));
			break;

		case 2:

			System.out.println("You have chosen to: Minus two numbers,");
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Please provide your first number:");
			double number3 = scan1.nextDouble();
			System.out.println("Please provide your second number:");
			double number4 = scan1.nextDouble();
			System.out.println("The answer is " + (number3 - number4));
			break;

		case 3:

			System.out.println("You have chosen to: multiply two numbers");
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Please provide your first number:");
			double number5 = scan2.nextDouble();
			System.out.println("Please provide your second number:");
			double number6 = scan2.nextDouble();
			System.out.println("The ansewr is " + (number5 * number6));
			break;

		case 4:

			System.out.println("You have chosen to: Divide two numbers");
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Please provide your first number:");
			double number7 = scan3.nextDouble();
			System.out.println("Please provide your second number:");
			double number8 = scan3.nextDouble();
			System.out.println("The answer is " + (number7 / number8));
			break;

		default:
			System.out.println("Computer said no!");
			break;
		}
		menuOption.close();
	}

}
