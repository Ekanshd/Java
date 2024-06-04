package com.jun3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(2,4,5,8);
		
		List<Integer>l2=l1.stream().map(i->i*2) .collect(Collectors.toList());
			System.out.println(l2);            
			
			//using foreach function
		l1.stream().map(j->j*j*j).forEach(k->System.out.println(k));
	}

}
