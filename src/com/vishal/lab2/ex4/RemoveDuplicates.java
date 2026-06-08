package com.vishal.lab2.ex4;


import java.util.Scanner;

public class RemoveDuplicates {
	public static int[] modifyArray(int[] arr) {
		if(arr==null||arr.length==0) {
			return new int[0];
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
		
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				count++;
			}
		}
		
		int[] result = new int[count];
		result[0] = arr[0];
		int index = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) 
			{
				result[index] = arr[i];
				index++;
			}
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
		sc.close();
		
	}

}
