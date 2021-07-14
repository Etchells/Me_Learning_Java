package com.me.exceptions;

public class Calculator {

	public double divide(double num1, double num2) throws DivideByZeroException{
		if(num2==0) {
			throw new DivideByZeroException("You can't divide by 0!");
		}
		return num1 / num2;

	}
	
}