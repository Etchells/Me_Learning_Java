package com.me.iterations.flowchart;

public class Runner2 {

	public static void main(String[] args) {
		
//		flowchart1();
//		flowchart2();
//		repeatFlowchart3();
		flowchart3again();
		
	}
////////////////////////////////////////////////////////////////	
	public static void flowchart1() {
		
      for(int A = 100; A <= 200; A++) {
      System.out.println("A "+A); // plus A so i can see the number
      }
	}
/////////////////////////////////////////////////////////////////	
	public static void flowchart2() {
		
		int A = 100;
		
		for(A = 100;A <= 200; A++) {
			if(A%2 == 0) {
			System.out.println("-"+A);
			}else {
			System.out.println("*"+A);
			}
	
		}
	}
////////////////////////////////////////////////////////////////////	
	public static void flowchart3() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void repeatFlowchart3() {
		
		  int count = 0;
	      boolean repeat = true;
	      
	      do {
	    	  for(int i=1;i<=10;i++) {
	  			System.out.println(i);
	  		}
	    	  count++;

	            if(count > 10) {
	            	repeat = false;
	            }
	        } while(repeat);

	    }
		
	
	
	public static void flowchart3again() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+i+" "+i+" "+i+" "+i+" "+i+" "+i+" "+i+" "+i+" "+i);
		}
	}	

///////////////////////////////////////////////////////////////////	
	
}
