package com.vishal.lab1.ex5;


import java.util.Scanner;

public class Sum {
	static int calculateSum(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%3==0||i%5==0)
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		num=sc.nextInt();
		if(num<=0) {
			System.out.println("It is not a natural number"); 
			sc.close();
	        return;
		}
		int sum=calculateSum(num);
		System.out.println("Sum of first n natural numbers that is divisible by 3 or 5: "+sum);
		sc.close();
		
		
	}

}
