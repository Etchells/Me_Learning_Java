package com.me.conditionals_flowcharts;

public class Runner2 {
	
	public static void main(String[] args) {
		
		int A = 250;
			
		if(A > 2000 && A < 6000) {
			 System.out.println("A");
		}else if(A > 2000 && A > 6000) {
			System.out.println("C");
		}else if(A > 2000 && A < 6000) {
			System.out.println("B");
		}else if(A > 2000 && A < 6000 && A > 4000) {
			System.out.println("D");
		}else if(A > 2000 && A < 6000 && A < 4000) {
			System.out.println("E");
		}else if(A < 2000) {
			System.out.println("1");
		}else if(A < 100) {
			System.out.println("2");
		}else if(A > 2000 && A > 100) {
			System.out.println("3");
		}else if(A > 2000 && A > 100 && A > 600) {
			System.out.println("5");
		}else if(A > 2000 && A > 100 && A < 600) {
			System.out.println("4");
		}else if(A > 2000 && A > 100 && A < 600 && A > 500) {
			System.out.println("6");
		}else if(A > 2000 && A > 100 && A < 600 && A < 500) {
			System.out.println("7");
			
			}
		
		
		}
	}

