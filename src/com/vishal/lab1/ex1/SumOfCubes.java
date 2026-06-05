package com.vishal.lab1.ex1;

import java.util.Scanner;

public class SumOfCubes {
	static int sum(int num) {
		if(num<0) {
			num*=-1;
		}
		
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=obj.nextInt();
		int sum=SumOfCubes.sum(num);
		System.out.println(sum);
		obj.close();
		
		
	}
	

}
