package com.vishal.lab3.ex5;
import java.util.Scanner;

public class CountLinesWordsChar {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text (type END to terminate): ");
		int charCount=0,linesCount=0,wordsCount=0;
		while(true) {
			String line=sc.nextLine();
			if(line.equals("END")) {
				break;
			}
			linesCount++;
			charCount+=line.length();
			String[] words = line.trim().split("\\s+");
			if (!line.trim().isEmpty()) {
			wordsCount += words.length;
			}
		}
		System.out.println("Characters count: "+charCount);
		System.out.println("Words count: "+wordsCount);
		System.out.println("Line count: "+linesCount);
		sc.close();
	}

}
