package com.may3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size for Row");
		int row=sc.nextInt();
		
		System.out.println("enter the size for Column");
		int Column=sc.nextInt();
		
		int arr[][]=new int[row][Column];
		
		System.out.println("Enter array Elemnts:");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}