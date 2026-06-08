package com.vishal.lab4.ex1;

public class Account {
	private static int counter=1000;
	
	protected int accNum;
	protected double balance;
	protected Person accHolder;
	
	public Account(Person accHolder,double balance) {
		this.accNum=++counter;
		this.accHolder=accHolder;
		this.balance=balance;
		
		}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public boolean withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			return true;
		}
		return false;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public String getName() {
		return accHolder.getName();
	}

}
