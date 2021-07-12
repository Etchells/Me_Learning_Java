package com.me.inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Owl owlFriend = new Owl();
		owlFriend.doThing();
		owlFriend.noise();  // will return "tweet", because Owl extends Bird!
							// if overridden in Owl class you will get another message
		
		Chicken chikin = new Chicken();
        chikin.doThing();
        chikin.cluck();
        chikin.noise(); // will return "tweet", because Chicken also extends Bird!
        				// if overridden in Chicken class you will get another message
		
		
	}
	
}
