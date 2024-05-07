package Assignments;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name:");
		String name=sc.next();
		System.out.println("Enter your id:");
		
		int id=sc.nextInt();
		System.out.println("Enter your designation:");
		
		String designation=sc.next();
		
		System.out.println("Enter your Salary:");
		int Salary =sc.nextInt();
	
		
		if(Salary>=90000) {
			System.out.println("Team Lead");
		}
		else if(Salary>80000 && Salary<=60000) {
			System.out.println("Sr.Devloper");
		}
		else if(Salary>50000 && Salary<=30000) {
			System.out.println("Jr.Devloper");
		}
		else if(Salary>30000 && Salary<=15000) {
			System.out.println("Test Engg");
		}
		else if(Salary<=15000) {
				System.out.println("Clerk");
		}
			
	}
}

