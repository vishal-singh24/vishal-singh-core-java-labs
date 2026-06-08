package com.vishal.lab3.ex8;

import java.util.Scanner;

public class IsPositiveString {
	
	static boolean isPositive(String str) {
		str=str.toUpperCase();
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>=str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		str=str.toUpperCase();
		if(isPositive(str)) {
			System.out.println("It is a positive String");
		} else {
			System.out.println("It is not a positive String");
		}
		
		sc.close();
		
	}

}