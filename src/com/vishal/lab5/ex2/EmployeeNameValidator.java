package com.vishal.lab5.ex2;

import java.util.Scanner;

public class EmployeeNameValidator {
	
	public static void validateName(String firstName, String lastName) throws NameException{
		if(firstName==null||firstName.trim().isEmpty()||lastName==null||lastName.trim().isEmpty()) {
			throw new NameException(" First Name and Last Name cannot be blank.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName=sc.nextLine();
		
		try {
			validateName(firstName,lastName);
			System.out.println("Employee Name: "+ firstName+" "+lastName);
		}catch (NameException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
