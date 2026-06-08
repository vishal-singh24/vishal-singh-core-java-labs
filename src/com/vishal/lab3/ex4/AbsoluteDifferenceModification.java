package com.vishal.lab3.ex4;

import java.util.Scanner;


public class AbsoluteDifferenceModification {
	
	static int modifyNumber(int num) {
		String str=String.valueOf(num);
		String result="";
		for(int i=0;i<str.length()-1;i++) {
			int a=str.charAt(i)-'0';
			int b=str.charAt(i+1)-'0';
			int diff=Math.abs(a-b);
			result+=diff;
		}
		result+=str.length()-1;
		
		return Integer.valueOf(result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int result=modifyNumber(num);
		System.out.println(result);
		sc.close();
		
		
	}

}
