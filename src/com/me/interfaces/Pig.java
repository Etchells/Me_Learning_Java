package com.me.interfaces;

import com.me.interfaces.Interfaces.Animal;

public class Pig implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("The pig says: Oink");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Zzz");
	}

	
	
	public static void main(String[] args) {
		
	    Pig lilPig = new Pig();
	    lilPig.sound();
	    lilPig.sleep();
		
		
		
	}
	
	
}
