package com.me.conditionals;

public class Runner2 {
	public static int Physics = 25;			//max points 150
	public static int Chemistry = 50;		//max points 150
	public static int Biology = 150; 		//max points 150
	public static int Total = Physics + Chemistry + Biology;
	public static double Percentage = (Total * 100) / 450; 
	
	public static void main(String[] args) {
		
		method1();

//		Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
		
	}
	
	public static void method1() {
		System.out.println("Physics Score: "+ Physics);
		System.out.println("Chemistry Score: "+ Chemistry);
		System.out.println("Biology Score: "+ Biology);
		System.out.println("Total Score: "+ Total);
		System.out.println("Total Overall Percentage is: "+ Percentage+"%");
		if (Percentage<60) {
			System.out.println("You have failed!");
		}else {
			System.out.println("You have passed!");
		}
	}
	

	
}