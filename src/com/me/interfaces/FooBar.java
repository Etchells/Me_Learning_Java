package com.me.interfaces;

import com.me.interfaces.Interfaces.InterfaceOne;
import com.me.interfaces.Interfaces.InterfaceTwo;

public class FooBar implements InterfaceOne, InterfaceTwo{

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		System.out.println("Some text..");
	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		System.out.println("Some other text...");
	}

}
