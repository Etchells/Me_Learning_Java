package com.me.inheritance;

public class Owl extends Bird {

	private int wingspan = 30;
	
	public void doThing() {
		System.out.println("Wingspan: " + this.wingspan + ", Flight?: " + super.getFly());
	}
	@Override
    public void noise(){
        System.out.println("twit twoo");
    }
	
}
