package com.me.encapsulation;

import java.util.ArrayList;

public class BankAccount {

	// Class Members
	private String name;
	private float balance;
	
//	-------------------------------------------------------
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}
//	-------------------------------------------------------	
	// Default Constructor
	public BankAccount() {
		super();
	}

	// All Arguments Constructor
	public BankAccount(String name, float balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
//	-------------------------------------------------------
	// Getters and Setters
	// Getter
	public String getName() {
		return name;
	}
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	// Getter
	public float getBalance() {
		return balance;
	}
	// Setter
	public void setBalance(float balance) {
		this.balance = balance;
	}
//	-------------------------------------------------------
	// Defining ArrayList
	private ArrayList<BankAccount> accountList = new ArrayList<>();
	// Method to add to ArrayList------Adding Instances to ArrayList
	public void addToList(BankAccount newAccount) {
		accountList.add(newAccount);
	}
	// Method to print all in ArrayList
	public void printAll() {
		for(BankAccount i : accountList) {
			System.out.println(i);
		}
	}
	// Method that can search for a specific Person by their name
	public void search(String name) {
		for(BankAccount tempName : accountList){
			if(tempName.getName()==name) {
				System.out.println("Account Found: " + tempName);
			}
		}
	}
//	-------------------------------------------------------
	// Method to deposit money
	public void deposit(float depositAmount) {
		this.balance = balance + depositAmount;
	}
//	-------------------------------------------------------
	// Method to withdraw money with warning for going overdrawn!
	public void withdraw(float withdrawAmount) {
		if(withdrawAmount > this.balance) {
			System.out.println("Insuffient funds to withdraw " + withdrawAmount);
		}else {
			this.balance = balance - withdrawAmount;{
			System.out.println(withdrawAmount + " Approved");
				
		}
		}
	}
}
