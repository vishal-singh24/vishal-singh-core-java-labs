package com.vishal.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSort {
	
	public static int[] getSorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int reverse=0;
			while(num>0) {
				int rem=num%10;
				reverse=reverse*10+rem;
				num/=10;
			}
			arr[i]=reverse;
		}
		
		Arrays.sort(arr);
		return arr;
		 
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
		
		int[] result=getSorted(arr);
		System.out.println("Sorted array and reverse of each numbers: ");
		for(int num:result) {
			System.out.println(num+" ");
		}
		sc.close();
	}

}
