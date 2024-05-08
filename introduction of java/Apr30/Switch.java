package com.apr30;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int ch =sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Monday");
		break;
		
		case 2:
			System.out.println("Tuseday");
		break;
		
		case 3:
			System.out.println("Wednesday");
		break;
		
		case 4:
			System.out.println("Thusday");
		break;
		
		case 5:
			System.out.println("Firday");
		break;
		
		case 6:
			System.out.println("Saturday");
		break;
		
		case 7:
			System.out.println("Sunday");
		break;
		
		default:
			System.out.println("Better luck next time");
		}
		
	}

}
