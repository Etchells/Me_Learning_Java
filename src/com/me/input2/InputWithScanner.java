package com.me.input2;

import java.util.Scanner;

public class InputWithScanner {

	public static int myOption() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Option Number....");

		String user = scan.nextLine();
		System.out.println("You have chosen Option " + user);

		scan.close();
//		return user;
		return 0;
	}

}
