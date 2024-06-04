package com.jun3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTechnique {

	public static void main(String[] args) {
		
		List<Integer>l1=Arrays.asList(10,5,3,2,1,0,8);
		
		List<Integer>l2=l1.stream() 
				   .sorted()
				   .collect(Collectors.toList());
		           
		System.out.println(l2);
		List<Integer>l3=l1.stream() 
				   .sorted(Comparator.reverseOrder())
				   .collect(Collectors.toList());
		           
		System.out.println(l3);
		
	}

}