package com.may3;

public class ArrayBasic {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		a[0]=10;
		a[2]=20;
		a[3]=50;
		System.out.println(a);
		System.out.println(a[2]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
