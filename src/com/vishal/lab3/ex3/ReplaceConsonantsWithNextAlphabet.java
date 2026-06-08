package com.vishal.lab3.ex3;

import java.util.Scanner;

public class ReplaceConsonantsWithNextAlphabet {
	static String alterString(String str) {
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') {
				continue;
			}
			else {
				arr[i]+=1;
			}
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		String newStr=ReplaceConsonantsWithNextAlphabet.alterString(str);
		System.out.println("New String: "+newStr);
		sc.close();
		
		
	}

}
