package com.may23;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		HashSet<Facebook>set=new HashSet<>();
		
		Facebook f1=new Facebook(01,"sam", 5689452357L);
		Facebook f2=new Facebook(02,"Ekansh", 1234567896L);
		Facebook f3=new Facebook(03,"Aashik", 9876543215L);
		
		set.add(f1);
		set.add(f2);
		set.add(f3);
		System.out.println(set.toString());
		
		for(Facebook n:set) {
			System.out.println(n.fid+" "+n.fbProfile+" "+n.contactNo);
		}

	}

}
