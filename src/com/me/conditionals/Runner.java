package com.me.conditionals;

public class Runner {
	public static void main(String[] args) {

		double number1 = 55;
		double number2 = 20;

        if(number1 < number2) {
            System.out.println("The division cannot be performed");
        } else {
            System.out.println(number1 / number2);
        }
    }
}