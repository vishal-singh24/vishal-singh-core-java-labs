package com.vishal.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DurationInDaysMonthsYears {
	
	static void printDuration(LocalDate date) {
		LocalDate currentDate=LocalDate.now();
		Period period=Period.between(date, currentDate);
		System.out.println("Duratiions: ");
		System.out.println(period.getYears()+ " Years ");
		System.out.println(period.getMonths()+" Months ");
		System.out.println(period.getDays()+ " Days ");
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in the format yyyy-mm-dd: ");
		String date=sc.nextLine();
		LocalDate parseDate=LocalDate.parse(date);
		printDuration(parseDate);
		sc.close();
	}

}
