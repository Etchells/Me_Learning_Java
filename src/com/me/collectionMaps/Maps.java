package com.me.collectionMaps;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> cars = new HashMap<>();
		
		cars.put(1, "Audi");
		cars.put(2, "Ford");
		cars.put(3, "Mercedes");
		cars.put(4, "BMW");
		System.out.println(cars);
		
//		cars.containsKey(1);
		System.out.println(cars.containsKey(1));
		System.out.println(cars.containsValue("Audi"));
		
		for(String v : cars.values()) {
			System.out.println(v);
		}
		
		for(Integer k : cars.keySet()) {
			System.out.println(k);
		}
		for(Integer i : cars.keySet()) {
			System.out.println(String.format("Key: %d, value: %s", i, cars.get(i)));
		}
		
		for(java.util.Map.Entry<Integer, String> i : cars.entrySet()) {
			System.out.println(i);
		}
		
	}
	
}
