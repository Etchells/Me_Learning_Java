package com.me.generics;

public class demo<A> {

	A obj;
	
	
	public demo (A object) {
		this.obj = object;	
	}
	
	public void print() {
		System.out.println(obj);
		System.out.println(obj.getClass().getName());
	}
//-----------------------------------------------------------	
	public static void main(String[] args) {
		
		demo<Integer> i = new demo<Integer>(2);
		
		demo<String> str = new demo<String>("Cat");
		
		i.print();
		str.print();
		
	}
	
}
