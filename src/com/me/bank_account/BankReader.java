package com.me.bank_account;

public class BankReader {
	
	
	public static void main(String[] args) {
		
		BankAccount bA = new BankAccount();
		
		BankAccount Glenn = new BankAccount("Glenn", 2619318, 1000);
		BankAccount Lisa = new BankAccount("Lisa", 1297, 2000);
		
		
		
		
		
		
		System.out.println(bA.getBalance());
		
		bA.withdraw(5001);
		
		bA.addToList(Glenn);
		bA.addToList(Lisa);
		
		bA.printAll();
	}
	
	
	
	
}
