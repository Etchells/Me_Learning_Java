package com.me.operators_calculator;

public class Runner2 {

// Entry point - MAIN METHOD
public static void main(String[] args) {
//	System.out.println(addTwo(10.5423456d, 150.46465d));
//	System.out.println(addTwo(2354467, 20000));
//	System.out.println(addTwo(1343, 345646));
//	System.out.println(subTwo(10, 20));// -10
//	System.out.println(subTwo(30, 20));
	System.out.println(addTwo(30.25, 20.5));
	System.out.println(subTwo(30.25, 20.5));
	System.out.println(mulTwo(30.25, 20.5));
	System.out.println(divTwo(30.25, 20.5));

}// END

// methods - outside of the main method
public static double addTwo(double number1, double number2) {
	return number1 + number2;
}

public static double subTwo(double number1, double number2) {
	return number1 - number2;
}

public static double mulTwo(double number1, double number2) {
	return number1 * number2;
}

public static double divTwo(double number1, double number2) {
	return number1 / number2;
}
}