package com.me.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
//------------------------------------------------------------------------------------------------			
//		Given the following List of names, using a stream, have it print "Hello " 
//		in front of each name besides "James".

//		("Michael", "Dean", "James", "Chris")
		System.out.println("Question 1");
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		
	    names.stream()
	    .filter(x -> x != "James")
        .forEach(x -> System.out.println("Hello " + x));
		System.out.println("\n");
//------------------------------------------------------------------------------------------------		
		
//		Given the following List of Integers, using a stream, have it reduce and print the product 
//		(all numbers multiplied together).

//		(3, 4, 7, 8, 12)	
		System.out.println("Question 2");
		List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12);
		
		int multiply =
				numbers.stream()
				.reduce((a,b)->a*b)
				.get();
		  	System.out.println(multiply);
		  	System.out.println("\n");
//------------------------------------------------------------------------------------------------
//		  	Starting with a list of numbers, use streams to do the following:
		  	System.out.println("Question 3"); 	
		  	List<Integer> myNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		    System.out.println("The list contains the following:");
		    System.out.println(myNumbers);
//		  	Find the max value.
		       Integer max = 
		    		   myNumbers.stream()
		    		   .max(Integer::compare)
		    		   .get();   
		       System.out.print("The max value is " + max);       
		       System.out.print("\n");
		        
//		        Find the min value
			    Integer min = 
			    		myNumbers.stream()
			    		.min(Integer::compare)
			    		.get();   
			    System.out.print("The min value is " + min);
			    System.out.print("\n");
			    
//			 Remove the odd numbers.  
	
			    System.out.println("Now with odd numbers removed");
			    
			    List<Integer> odd =
			    		myNumbers.stream()
			    		.filter(x -> x % 2 == 0)
			    		.collect(Collectors.toList());
			    System.out.println(odd);
//			    
//			    Remove the even numbers.
			    System.out.println("Now with even numbers removed");

			    List<Integer> even =			    
			    		myNumbers.stream()
			    		.filter(x -> x % 2 != 0)
			    		.collect(Collectors.toList());
	    		System.out.println(even);
//	    		
//	    		Find the sum of the list.
	    
//	    		System.out.println(myNumbers);
			    Integer sum =
			    		myNumbers.stream()
			    		.reduce(0, (a, b) -> a + b);
			    System.out.println("The sum of the list is: " + sum);
			    
//			    Square every number in the list then remove the even numbers and then find the min value.
			    System.out.println("Square every number in the list then remove the even numbers and then find the min value.");
			    Integer doStuff = myNumbers.stream()
			    		.map(x -> x * x)
//			    		.peek(System.out::print)
//			    		.peek(x -> System.out.println(x))
			    		.filter(x -> x % 2 != 0)
//			    		.peek(System.out::print)
//			    		.peek(x -> System.out.println(x))
			    		.min(Integer::compare)
			    		.get();
//			    		.collect(Collectors.toList());
			    System.out.println(doStuff);

			    			
	}
	
	
	
}
