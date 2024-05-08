package com.apr30;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int no =sc.nextInt();
		
		if(no%2==0){
			System.out.println("number is Even");
		}
		
		else {
			System.out.println("Number is odd");
		}

	}

}
