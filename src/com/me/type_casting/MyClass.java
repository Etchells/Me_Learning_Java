package com.me.type_casting;

public class MyClass {
	
	public static void main(String[] args) {
		
//		Widening Casting > smaller to bigger in terms of data types
//		byte -> short -> char -> int -> long -> float -> double
		int myInt1 = 100;
		System.out.println(myInt1);
		
	    double myDouble1 = myInt1;
	    System.out.println(myDouble1);
	    
	    System.out.println("\n");
	    
//	    Narrowing Casting > bigger to small in terms of data types
//	    double -> float -> long -> int -> char -> short -> byte    
	    double myDouble2 = 9.78;
	    System.out.println(myDouble2);
	    
	    int myInt2 = (int) myDouble2;
	    System.out.println(myInt2);
	}
	
	
}
