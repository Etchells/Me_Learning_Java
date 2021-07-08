package com.me.array;

public class Runner {

	
	public static void main(String[] args) {
//		Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
		
//		int[] myNumbers = {1,2,3,4,5,6,7,8,9,10};
		
//		System.out.println(myNumbers[0]);
//		System.out.println(myNumbers[1]);
//		System.out.println(myNumbers[2]);
//		System.out.println(myNumbers[3]);
//		System.out.println(myNumbers[4]);
//		System.out.println(myNumbers[5]);
//		System.out.println(myNumbers[6]);
//		System.out.println(myNumbers[7]);
//		System.out.println(myNumbers[8]);
//		System.out.println(myNumbers[9]);
		
//		for (int i = 0; i <= myNumbers.length-1; i++) {
//			System.out.println(myNumbers[i]);
//			
//			for(int tempVal: myNumbers) {
//				System.out.println(tempVal);
//			}
//		}
		

//		Create a for loop that populates an integer array with values, outputting them at each iteration.
		
		int[] extraNumbers = new int[10];
		
		for ( int i = 0; i <=9; i++){
			extraNumbers[i] = i;
			System.out.println(extraNumbers[i]);
		}
//		Then create another loop that iterates through the array, changing the values at each point to equal 
//		itself times 10, outputting them at each iteration.

		
	}
	
}
