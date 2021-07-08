package com.me.iterations.flowchart;

public class Runner {
	
	
	public static void main(String[] args) {
		
		//flowchart 1
		
//        for(int A = 100; A <= 200; A++) {
//            System.out.println("A "+A); // plus A so i can see the number
//        }
		
        //flowchart 2
		
//		int A = 100;
//		
//		for(A = 100;A <= 200; A++) {
//			if(A%2 == 0) {
//			System.out.println("even -");
//			}else {
//			System.out.println("odd *");
//		}
//		}
		looping();
		
	}
//	Create a method that can print out the numbers 1-10 10 times each.
	
	public static void looping() {
		int A = 100;
		
		for(A = 100;A <= 200; A++) {
			
			if(A%2 == 0) {
			System.out.println("even -"+A);
			
			}else {
			System.out.println("odd *"+A);
		}
		}
		printNums();
	}
	public static void printNums() {
		for(int i=1;i<=10;i++) {
			System.out.println("Print nums is counting "+i);
		}
	}		
}
	



	
