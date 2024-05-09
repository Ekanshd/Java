package com.may9;

import java.util.Scanner;

class User1 {
	String uname;
	String email;
	User1(String uname,String email){
		this.uname=uname;
		this.email=email;
	}
	void show() {
		System.out.println(uname+" "+email);
	}
	User1(){};
}
public class ConstructorScanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User1 u2 =new User1();
		System.out.println("Enter student uname:");
		u2.uname = sc.nextLine();
		System.out.println("Enter student email:");
		u2.email = sc.nextLine();
		
	u2.show();

	}

}