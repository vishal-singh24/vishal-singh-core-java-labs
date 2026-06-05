package com.vishal.lab1.ex3;

import java.util.Scanner;

public class Fibonacci {
	
	static int recursive(int nthValue) {
		if(nthValue<=2)
			return 1;
		return recursive(nthValue-1)+recursive(nthValue-2);
			
	}
	
	static int iterative(int nthValue) {
		int a=1,b=1;
		int count=2;
		if(nthValue==1||nthValue==2)
			return a;
		
		while(count<nthValue) {
			int c=a+b;
			a=b;
			b=c;
			count++;
		}
		return b;
		
		
	}
	
	public static void main(String[] args) {
		
		int nthValue;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth value ");
		nthValue=sc.nextInt();
		if(nthValue<=0)
		{
			System.out.println("Value of n can not be less than 1");
			return;
		}
		System.out.println("Nth value using recursive "+ Fibonacci.recursive(nthValue));
		System.out.println("Nth value using iterative "+ Fibonacci.iterative(nthValue));
		sc.close();
		
		
	}

}
