package com.vishal.lab1.ex8;

import java.util.Scanner;

public class IsPowerOf2 {
	boolean checkNumber(int num) {
		return num>0 && (num & (num-1))==0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(num<1) {
			System.out.println("Entered number is a power of 2: "+false); 
			sc.close();
			return;
			
		}
		IsPowerOf2 obj=new IsPowerOf2();
		boolean ans=obj.checkNumber(num);
		System.out.println("Entered number is a power of 2: "+ans);
		sc.close();
		
		
	}

}
