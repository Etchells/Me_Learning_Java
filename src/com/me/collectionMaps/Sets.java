package com.me.collectionMaps;

import java.util.HashSet;

public class Sets {

	
	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();

		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mercedes");
		
//		cars.remove("Ford");
//		cars.clear();
		
		cars.forEach(System.out::println);
		
		System.out.println(cars);
		
		System.out.println(cars.contains("BMW"));
		
		System.out.println("\n" + cars.size());
		
		
	}
	
	
}
