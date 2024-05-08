package com.may4;

public class Compare {

	public static void main(String[] args) {
		
		String msg="The rain in The Spain";
		
		System.out.println(msg);
		
		
		System.out.println(msg.toLowerCase());
		
		
		System.out.println(msg.toUpperCase());
		
		String s1="Hi";
		String s2="Hello";
		String s3="Hru";
		String s4="Hi";
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s3));
		

	}

}
