package com.me.operators_results;

public class Runner {
	
	public static void main(String[] args) {
		//method1();
		method2();
		
	}
	
	public static void method1() {
		int Physics = 150;		//max points 150
		int Chemistry = 150;	//max points 150
		int Biology = 150; 		//max points 150
		int Total = Physics + Chemistry + Biology;
		System.out.println("Physics Score: "+ Physics);
		System.out.println("Chemistry Score: "+ Chemistry);
		System.out.println("Biology Score: "+ Biology);
		System.out.println("Total Score: "+ Total);
	}
	
	public static void method2() {
		int Physics = 25;		//max points 150
		int Chemistry = 50;		//max points 150
		int Biology = 150; 		//max points 150
		int Total = Physics + Chemistry + Biology;
		double Percentage = (Total * 100) / 450; 
		System.out.println("Physics Score: "+ Physics);
		System.out.println("Chemistry Score: "+ Chemistry);
		System.out.println("Biology Score: "+ Biology);
		System.out.println("Total Score: "+ Total);
		System.out.println("Total Overall Percentage is: "+ Percentage+"%");
	}
}

