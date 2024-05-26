package com.may23;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetAndTypes {

	public static void main(String[] args) {
		
		HashSet <Integer>s1=new HashSet<>();
		
		s1.add(10);
		s1.add(5);
		s1.add(10);
		s1.add(3);
		s1.add(6);
		System.out.println(s1);
		
		LinkedHashSet <Integer>s2=new LinkedHashSet<>();
		
		s2.add(10);
		s2.add(5);
		s2.add(10);
		s2.add(3);
		s2.add(6);
		System.out.println(s2);
		
			TreeSet <Integer>s3=new TreeSet<>();
		
		s3.add(10);
		s3.add(5);
		s3.add(10);
		s3.add(3);
		s3.add(6);
		System.out.println(s3);
		
		
		for(int i:s3) {
			System.out.println(i);
		}
		System.out.println("Using Iterator");
		
	Iterator<Integer>itr=s3.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
} 
	}

}