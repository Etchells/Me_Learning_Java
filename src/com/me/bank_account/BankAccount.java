package com.me.bank_account;

import java.util.ArrayList;

import com.me.constructors_challenge.Person;

public class BankAccount {



private String name;
private int Id;
private double balance;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public double getBalance() {
	return balance;
}

private void setBalance(double balance) {
	this.balance = balance;
}




public BankAccount() {
	super();
}


public BankAccount(String name, int id, double balance) {
	super();
	this.name = name;
	Id = id;
	this.balance = balance;
}


@Override
public String toString() {
	return "BankAccount [name=" + name + ", Id=" + Id + ", balance=" + balance + "]";
}

private ArrayList<BankAccount> accountList = new ArrayList<>();

public void addToList(BankAccount bA) {
	accountList.add(bA);
	
}
public void printAll() {
	for (BankAccount bA : accountList) {
		System.out.println(bA);
	}
}

public void deposit(double depositAmount) {
	this.balance = balance + depositAmount;
}
public void withdraw(double withdrawAmount) {
	if(withdrawAmount>this.balance) {
		System.out.println("Insuffient Funds");
	}else {
		this.balance = balance - withdrawAmount;}
}


}
