package com.vishal.lab1.ex2;

import java.util.Scanner;

public class TrafficLightsSimulation {
	public static void main(String[] args) {
		int val;
		System.out.println("Select the light\n1.Red\n2.Yellow\n3.Green");
		Scanner sc=new Scanner(System.in);
		val=sc.nextInt();
		
		switch(val) {
		case 1: System.out.println("stop");
		break;
		case 2: System.out.println("ready");
		break;
		case 3: System.out.println("go");
		break;
		default:System.out.println("Wrong selection");
		}
		sc.close();
	}

}
