package com.me.lambda;

import java.util.ArrayList;

public class Lambda {
	
	
public static void main(String[] args) {
	
	ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);

//    (arg1, arg2) -> {System.out.println("Two arguments " + arg1 + " and " + arg2);}
    arrayList.forEach(n -> System.out.println(n));						// prints all of the array
    
    arrayList.forEach(n -> {if (n % 2 == 0) System.out.println(n);});	// prints all in the array that when divided by 2 have a remainder equal to 0
    arrayList.forEach(n -> {if (n % 2 != 0) System.out.println(n);});	// prints all in the array that when divided by 2 have a remainder not equal to 0
}



}
