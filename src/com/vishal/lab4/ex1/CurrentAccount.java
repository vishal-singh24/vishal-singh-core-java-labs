package com.vishal.lab4.ex1;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	
	public CurrentAccount(Person accHolder, double balance, double overdraftLimit) {
		super(accHolder,balance);
		this.overdraftLimit=overdraftLimit;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(balance+overdraftLimit>=amount) {
			balance-=amount;
			return true;
		}
		System.out.println("Overdraft limit exceeded.");
		return false;
	}

}
