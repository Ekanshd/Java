package com.jun3;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
	
		//with old java
		List<Integer>list=Arrays.asList(2,5,3,6,5);
	
		int sum=0;
		for(int x:list) {
			sum=sum+x;
			       
		}
		System.out.println(sum);
	//with lambda expression
		Integer sumofnumbers=list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sumofnumbers);
		//with normal method=
		Integer sumno=list.stream().reduce(0,Integer::sum);

	}

}