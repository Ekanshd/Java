package com.may7;
/*Overloading-Method with same name but diffrent parameter*/
public class OverloadingDemo1 {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(String a ,String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		OverloadingDemo1 o1=new OverloadingDemo1();
		
		o1.add(10, 20);
		o1.add(10, 20,30);
		o1.add("Hello", "world");
	}

}