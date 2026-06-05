package com.vishal.lab2.ex4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RemoveDuplicates {
	public static int[] modifyArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				arr[i+1]=0;
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				count++;
		}
		
		int[] result=new int[count];
		for(int i=0;i<count;i++) {
			result[i]=arr[i];
		}
		
		return result;
		
		
		
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
		
		int[] result=modifyArray(arr);
		for(int num:result) {
			System.out.println(num+" ");
		}
		
	}

}
