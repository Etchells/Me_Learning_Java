package com.me.enum_test_days;

import java.util.Scanner;

public class Runner {
//	Create an interactive program loop that asks the user for the day of the week as a string 
//	or numeric value, store this in a variable
//	Match the variable to the correct enum constant and print its description
	
	public static void main(String[] args) {
		
//		Scanner myScanner = new Scanner(System.in);
//		

		DaysOfTheWeek myDay = DaysOfTheWeek.MONDAY;
		System.out.println(myDay);
		
	}
}
