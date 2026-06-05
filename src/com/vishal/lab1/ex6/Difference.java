package com.vishal.lab1.ex6;

import java.util.Scanner;

public class Difference {
	static double calculateDifference(int num) {
		double sumOfSquares= (num*(num+1)*(2*num+1))/6;
		double squareOfSum= (num*(num+1)/2)*(num*(num+1)/2);
		
		return sumOfSquares-squareOfSum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int num=sc.nextInt();
		if(num<1) {
			System.out.println("Not a valid natural number");
			return;
		}
		double difference=Difference.calculateDifference(num);
		System.out.println("Difference between the sum of squares and the square of the sum of the first n natural numbers: "+difference);
		sc.close();
	}

}
