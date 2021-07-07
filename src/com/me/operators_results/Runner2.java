package com.me.operators_results;

import javax.swing.JOptionPane;

public class Runner2 {

	public static int Physics = 25;			//max points 150
	public static int Chemistry = 50;		//max points 150
	public static int Biology = 150; 		//max points 150
	public static int Total = Physics + Chemistry + Biology;
	public static double Percentage = (Total * 100) / 450; 
	
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
		
	}
	
	public static void method1() {
		System.out.println("Physics Score: "+ Physics);
		System.out.println("Chemistry Score: "+ Chemistry);
		System.out.println("Biology Score: "+ Biology);
		System.out.println("Total Score: "+ Total);
	}
	
	public static void method2() {
		System.out.println("Physics Score: "+ Physics);
		System.out.println("Chemistry Score: "+ Chemistry);
		System.out.println("Biology Score: "+ Biology);
		System.out.println("Total Score: "+ Total);
		System.out.println("Total Overall Percentage is: "+ Percentage+"%");
	}
	
	public static void method3() {
		String response;
		response = JOptionPane.showInputDialog("What is your name?");			//input box
		String name = response;
		
		response = JOptionPane.showInputDialog("What is your Physics mark?");	//input box
		int Physics = Integer.parseInt(response);
		
		response = JOptionPane.showInputDialog("What is your Chemistry mark?");	//input box
		int Chemistry = Integer.parseInt(response);
		
		response = JOptionPane.showInputDialog("What is your Biology mark?");	//input box
		int Biology = Integer.parseInt(response);
		
		int Total = Physics + Chemistry + Biology;
		double Percentage = (Total * 100) / 450; 
		
		System.out.println("Hi "+ name);
		System.out.println("\nHere are your results");
		System.out.println("\nPhysics Score: "+ Physics);
		System.out.println("Chemistry Score: "+ Chemistry);
		System.out.println("Biology Score: "+ Biology);
		System.out.println("\nTotal Score: "+ Total);
		System.out.println("\nTotal Overall Percentage is: "+ Percentage+"%");
	}
	
}