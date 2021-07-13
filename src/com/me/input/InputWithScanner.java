package com.me.input;

import java.util.Scanner;

public class InputWithScanner {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");

        String user = scan.nextLine();
        System.out.println("Hello " + user);
    }
	
	
}
