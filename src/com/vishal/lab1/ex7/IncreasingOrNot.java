package com.vishal.lab1.ex7;

import java.util.Scanner;

public class IncreasingOrNot {
	static boolean checkNumber(int num) {
		int prevRem=10;
		while(num>0) {
			int rem=num%10;
			if(rem>prevRem)
				return false;
			prevRem=rem;
			num/=10;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		boolean ans=IncreasingOrNot.checkNumber(num);
		System.out.println("Entered Number is increasing: "+ans);
		sc.close();
		
	}

}
