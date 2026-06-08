package com.vishal.lab4.ex1;

public class TestAccount {
	public static void main(String[] args) {
		Person smith=new Person("Smith");
		Person kathy=new Person("Kathy");
		
		SavingsAccount smithAcc=new SavingsAccount(smith,2000);
		SavingsAccount kathyAcc=new SavingsAccount(kathy,3000);
		
		smithAcc.deposit(2000);
		
		kathyAcc.withdraw(2000);
		System.out.println("Updated Account Details: ");
		System.out.println(smithAcc.getName()+" (Acc No: "+ smithAcc.getAccNum()+" ) Balance= INR "+ smithAcc.getBalance());
		System.out.println(kathyAcc.getName()+" (Acc No: "+ kathyAcc.getAccNum()+" ) Balance= INR "+ kathyAcc.getBalance());

	}

}
