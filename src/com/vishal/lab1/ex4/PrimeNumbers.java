package com.vishal.lab1.ex4;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num<=1) {
			System.out.println("No prime number exists");
			return;
		}
		System.out.println("All prime numbers till "+num);
		for(int i=2;i<=num;i++) {
			int count=0;
			for(int j=1;j<=num;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
		sc.close();
		}

}
