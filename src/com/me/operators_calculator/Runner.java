package com.me.operators_calculator;

public class Runner {

	public static void main(String[] args) {

		example1();
		example2();
		example3();
		example4();
		
	}
	public static void example1() {
		int num1 = 3;
		int num2 = 4;
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public static void example2() {
		int num1 = 3;
		int num2 = 4;
		int result = num1 * num2;
		System.out.println(result);
	}
	
	public static void example3() {
		int num1 = 3;
		int num2 = 4;
		int result = num1 - num2;
		System.out.println(result);
	}
	
	public static void example4() {
		double num1 = 3.0d;
		double num2 = 4.0d;
		double result = num1 / num2;
		System.out.println(result);
	}
	
}