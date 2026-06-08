package com.vishal.lab5.ex1;

import java.util.Scanner;

public class AgeValidator {
	public static void validateAge(int age) throws AgeException{
		if(age<15) {
			throw new AgeException("Age should be above 15");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		try {
			validateAge(age);
			System.out.println("Valid Age. ");
			
		}catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		
	}

}
