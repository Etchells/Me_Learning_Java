package com.me.encapsulation;


public class Runner {

	
	public static void main(String[] args) {
		
		
//		-------------------------------------------------------
		// adding elements to the ArrayList
		BankAccount account = new BankAccount();
		
		BankAccount glenn = new BankAccount("Glenn", 1000);
		BankAccount lisa = new BankAccount("Lisa", 40000);
		
		
		account.addToList(glenn);
		account.addToList(lisa);
		// Printing to check
		account.printAll();
		
		
		account.search("Glenn");
		
//		-------------------------------------------------------

		// adding cash to balance
		glenn.deposit(2000f);
		System.out.println(glenn);
		
		// withdrawing cash
		glenn.withdraw(400f);
		System.out.println(glenn);
		
	}
	
}
