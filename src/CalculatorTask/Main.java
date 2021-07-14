package CalculatorTask;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	static int operation;
	
	public static void main(String[] args) throws DivideByZeroException {
		Calculator calc = new Calculator();
		
		double num1;
		double num2;
		boolean running = true;

		while (running) {
			
			operation = calc.menu();

			switch (operation) {
			case 1:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.addition(num1, num2));
				break;
			case 2:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.subtract(num1, num2));
				break;
			case 3:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.multiply(num1, num2));
				break;
			case 4:
				System.out.println("Enter your first number:");
				num1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				num2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.divide(num1, num2));
				break;
			case 0:
				System.out.println("Quitting.");
				scan.close();
				running = false;
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
	


}
