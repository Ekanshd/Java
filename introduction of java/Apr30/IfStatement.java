package com.apr30;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		
		int no=sc.nextInt();
		
		if(no%2==0) {
			System.out.println("Nmunber is Even");
		}
		

	}

}
