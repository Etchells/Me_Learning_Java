package com.me.inheritance;

public class Chicken extends Bird{

	private int eggCount = 0;

    public void doThing(){
        System.out.println("Egg count: " + eggCount + ", Flight?: " + super.getFly());
    }

    public void cluck() {
        System.out.println("bwark");
    }
	
	@Override
    public void noise(){
        System.out.println("cluck cluck");
    }
    
}
