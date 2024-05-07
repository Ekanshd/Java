package Assignments;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Marks:");
		
		 int a=sc.nextInt();
		 
		 System.out.println("Enter second Marks:");
			
		 int b=sc.nextInt();
		 
		 System.out.println("Enter Third Marks:");
			
		 int c=sc.nextInt();
		 
		 int sum= a+b+c;
			System.out.println("Total marks"+sum);
			
		float avg=(sum/3);
			System.out.println("Total average"+avg);
		
	}

}
