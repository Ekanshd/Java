package com.apr29;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		
		String name=s.next();
		
		System.out.println("Enter address");
		String address=s.next();
		
		System.out.println("Enter age");
		int age=s.nextInt();
		
		System.out.println(name+" "+address+" "+age);
	}

}
