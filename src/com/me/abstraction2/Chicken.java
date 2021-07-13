package com.me.abstraction2;

import com.me.abstraction2.Bird.Flyable;
import com.me.abstraction2.Bird.Hatchable;

public class Chicken implements Flyable, Hatchable {

	@Override
	public void emergeFromEgg() {
		// TODO Auto-generated method stub
		System.out.println("cracking egg...");
	}

	@Override
	public void cheep() {
		// TODO Auto-generated method stub
		System.out.println("cheep");
	}

	@Override
	public void spreadWings() {
		// TODO Auto-generated method stub
		System.out.println("spreading wings...");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("taking off... WHOOSH");
	}

}
