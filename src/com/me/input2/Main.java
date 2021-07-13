package com.me.input2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Message.welcomeMsg();

			Calculations.calculation();
//
//		Scanner keyboard = new Scanner(System.in);
//
//		String answer;
//		do {
//			start();
//			System.out.println("do you wish to repeat? Yes or No");
//			answer = keyboard.next();
//		} while (answer.equalsIgnoreCase("Yes"));

	}

	public static void start() {
//		Message.welcomeMsg();
		Calculations.calculation();
	}

}
