package com.vishal.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToInt {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String which will consist of integers");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		int sum=0;
		while(st.hasMoreTokens()) {
			int num=Integer.parseInt(st.nextToken());
			System.out.println(num);
			sum+=num;
		}
		System.out.println("Sum of all integers: "+ sum);
		sc.close();
	}

}
