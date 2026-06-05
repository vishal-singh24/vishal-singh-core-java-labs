package com.vishal.lab2.ex1;

import java.util.Scanner;

public class SecondSmallest {
	static int getSecondSmallest(int [] arr) {
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i]!=smallest) {
				secondSmallest=arr[i];
			}
		}
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int secondSmallest=SecondSmallest.getSecondSmallest(arr);
		if(secondSmallest==Integer.MAX_VALUE)
			System.out.println("Second Smallest does not exist");
		else
			System.out.println("Second smallest is: "+secondSmallest);
		sc.close();
		
	}

}
