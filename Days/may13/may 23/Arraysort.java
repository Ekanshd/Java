package com.may23;
import java.util.ArrayList;
import java.util.Collections;
/*How to sort ArrayList
 * 
 * using Collections.sort(object)
 * 
 * */
public class Arraysort {
public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(5);
		a1.add(0);
		a1.add(1);
		a1.add(2);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("After sorting");
		System.out.println(a1);
		
}
}