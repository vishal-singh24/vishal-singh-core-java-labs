package com.vishal.lab3.ex2;

import java.util.Scanner;

public class MirrorImage {
	static String getImage(String str) {
		char[] arr=str.toCharArray();
		int length=arr.length;
		int right=length-1;
		for(int i=0;i<length/2;i++) {
			char temp = arr[i];
			arr[i] = arr[right];
			arr[right] = temp;
			right--;
			
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String mirrorStr=MirrorImage.getImage(str);
		System.out.println("String and its Mirror is:");
		System.out.println(str+"|"+mirrorStr);
		sc.close();
	}

}
