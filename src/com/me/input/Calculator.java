package com.me.input;

import java.util.Scanner;

import CalculatorTask.DivideByZeroException;

public class Calculator {

	public static void main(String[] args) throws DivideByZeroException{
		Scanner keyboard = new Scanner(System.in);

		String answer;
		do {
		
		System.out.println("Welcome to the best Calculator in the world!!\nPlease select one of the following options......");
		System.out.println("Option 1: to add two numbers");
		System.out.println("Option 2: to minus two numbers");
		System.out.println("Option 3: to multiply two numbers");
		System.out.println("Option 4: to divide two numbers");
		
		
		Scanner menuOption = new Scanner(System.in);
		int myOption = menuOption.nextInt();

		Calculator c = new Calculator();
		c.option(myOption);

//		menuOption.close();
		
		System.out.println("Do you wish to repeat? Yes or No");
		answer = keyboard.next();
		} while (answer.equalsIgnoreCase("Yes"));
		
	}

//	---------------------------------------------------------
	public void option(int myOption) throws DivideByZeroException {
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
//			----------------------------------------------------------------
			if(number8==0) {
				throw new DivideByZeroException("HEY!! You can't Divide by zero!");
			}
			
//			----------------------------------------------------------------				
			System.out.println("The answer is " + (number7 / number8));
			break;


		default:
			System.out.println("Invaild option. Goodbye");
			break;
		}
	}

}
