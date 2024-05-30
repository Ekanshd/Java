package com.may30;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<>();
		a1.add("C");
		a1.add("C++");
		a1.add("Java");
		a1.add("String");
		a1.forEach((i)->System.out.println((i)));
	}

}
