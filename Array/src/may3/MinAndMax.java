package com.may3;

import java.util.Arrays;

public class MinAndMax {

	public static void main(String[] args) {
		int a[]= {1,23,6,46,34,23,13,53,4};
		
		//Implemented ibuilt function to sort
		
		Arrays.sort(a);
		
		//after sorting the value at 10th position to nth position will be maximum
		
		System.out.println("min="+a[0]+ "Max="+a[a.length-1]);
	}

}
