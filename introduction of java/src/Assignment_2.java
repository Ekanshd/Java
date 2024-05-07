 package Assignments;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		
		 int a=sc.nextInt();
		 
		 System.out.println("Enter Second Number:");
			
		 int b=sc.nextInt();
		 
		 System.out.println("Enter Third Number:");
			
		 int c=sc.nextInt();
		 if(a==b && a==c && b==c) {
			 System.out.println("All Number are Equal");
		 }
		 if(a==b || b==c ||a==c) {
			 System.out.println("Some begin are Equal");
		 }
		 
	}

}
