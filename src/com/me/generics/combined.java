package com.me.generics;

public class combined<dub, i, str> {

	dub obj1;
	i obj2;
	str obj3;

	public combined(dub object1, i object2, str object3) {
		this.obj1 = object1;
		this.obj2 = object2;
		this.obj3 = object3;
	}

	public void print() {
		System.out.println(obj1);
		System.out.println(obj1.getClass().getName());
		System.out.println(obj2);
		System.out.println(obj2.getClass().getName());
		System.out.println(obj3);
		System.out.println(obj3.getClass().getName());
	}

	public static void main(String[] args) {

		combined<Integer,String,Double> i = new combined<Integer,String,Double>(10,"Cat",3d);
		
		i.print();

	}
}
