package com.me.yes_no_loop;

import java.util.Scanner;

public class YesNo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String answer;
		do {
			System.out.println("entre the price: ");
			double price = keyboard.nextDouble();

			System.out.println("entre the quantity: ");
			int qty = keyboard.nextInt();

			double total = price * qty;

			System.out.println("the total is £" + total);

			System.out.println("do you wish to repeat? Yes or No");
			answer = keyboard.next();
		} while (answer.equalsIgnoreCase("Yes"));

	}
}
