package com.me.input;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the best Calculator in the world!!\nPlease select one of the following options......");
		System.out.println("Option 1: to add two numbers");
		System.out.println("Option 2: to minus two numbers");
		System.out.println("Option 3: to multiply two numbers");
		System.out.println("Option 4: to divide two numbers");

		Scanner menuOption = new Scanner(System.in);
		int myOption = menuOption.nextInt();

		Calculator c = new Calculator();
		c.option(myOption);

		menuOption.close();
	}

//	---------------------------------------------------------
	public void option(int myOption) {
		int option = myOption;

		switch (option) {

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
			System.out.println("Invaild option. Goodbye");
			break;
		}
	}

}
