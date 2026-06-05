package com.vishal.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndConvert {
	
	public static String[] sortStrings(String[] str) {
		Arrays.sort(str);
		int leftHalf=str.length%2==0?str.length/2:(str.length/2)+1;
		
		for(int i=0;i<str.length;i++)
		{
			if(i<leftHalf) {
				str[i]=str[i].toUpperCase();
			}else {
				str[i]=str[i].toLowerCase();
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Strings: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		String[] str=new String[n];
		System.out.println("Enter the Strings: ");
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		
		String[] result=sortStrings(str);
		for(String arr:result) {
			System.out.print(arr+" ");
		}
		sc.close();
	}

}
