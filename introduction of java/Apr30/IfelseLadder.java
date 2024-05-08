package com.apr30;

import java.util.Scanner;

public class IfelseLadder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=sc.next();
		System.out.println("Enter Marks for m1:");
		
		int m1=sc.nextInt();
		System.out.println("Enter Marks for m2:");
		
		int m2=sc.nextInt();
		System.out.println("Enter Marks for m3:");
		
		int m3=sc.nextInt();
		
		int total=m1+m2+m3;
		double avg=total/3;
		System.out.println(name+" "+total+" "+avg);
		
		if(avg>80) {
			System.out.println("A Grade");
		}
		else if(avg>60 && avg<=80) {
			System.out.println("B Grade");
		}
		else if(avg>50 && avg<=60) {
			System.out.println("C Grade");
		}
		else if(avg>45 && avg<=50) {
			System.out.println("D Grade");
		}
		else if(avg>35 && avg<=45) {
			System.out.println("E Grade");
		}
		else  {
			System.out.println("Fail");
		}
		
		
		
		
	}

}
