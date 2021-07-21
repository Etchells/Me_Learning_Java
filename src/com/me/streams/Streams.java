package com.me.streams;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	
	public static void main(String[] args) {
		
	    List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
	    names.stream()
	            .forEach(x -> System.out.println(x));
	    		System.out.println("\n");
		
	    		//-------------------------------------------------------------------------------
	    		System.out.println("Squared");
	    		List<Integer> number = Arrays.asList(2,3,4,5);
	    		List<Integer> square = 
	    				number.stream()
	    					.map(x -> x*x)
	    					.collect(Collectors.toList());
	    		System.out.println(square);
	    		System.out.println("\n");
	    		
	    		//-------------------------------------------------------------------------------
	    		System.out.println("Filtered");
	    		List<String> names1 = Arrays.asList("Bob", "John", "Steve");
	    	    List<String> result = 
	    	        names1.stream()
	    	            .filter(str -> str.startsWith("S"))
	    	            .collect(Collectors.toList());		
	    	    System.out.println(result);
	    		System.out.println("\n");
	    		
	    		//-------------------------------------------------------------------------------
	    		System.out.println("Sorting");  		
	    	    List<String> names2 = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
	    	    List<String> result1 = 
	    	        names2.stream()
	    	            .sorted()
	    	            .collect(Collectors.toList());
	    	    System.out.println(result1);
	    		System.out.println("\n");
	    		
	    		//-------------------------------------------------------------------------------
	    		System.out.println("Those with a remainder equal to 0, then add those integers together"); 
	    	    List<Integer> number1 = Arrays.asList(2,3,4,5);
	    	    int even = 
	    	        number1.stream()
	    	            .filter(x -> x % 2 == 0)
	    	            .reduce((a,b) -> a+b)
	    	            .get();
	    	    System.out.println(even);
	    		System.out.println("\n");
	}
}
