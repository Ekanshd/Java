package com.may3;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Array:");
			int a=sc.nextInt();
			int b[]=new int[a];*/
		int[] arr = {1, 5, 10, 25};
		int sum = 0;
			System.out.println("Enter the number");
			

		// Loop through the array elements and store the sum in the sum variable
		for (int i = 0; i < arr.length; i++) {
			
		  sum += arr[i];  //sum=sum+arr[i];
		}

		System.out.println("The sum is: " + sum);
	}
	}
