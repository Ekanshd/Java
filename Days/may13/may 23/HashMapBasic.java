package com.may23;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapBasic {

	public static void main(String[] args) {
		HashMap<Integer,String>hmap=new HashMap<>();
		
		//put method is used to add data
		hmap.put(100, "sam"); 
		hmap.put(101, "Ajay");
		hmap.put(95, "ram");
		hmap.put(100, "sujay");
		hmap.put(96, "rohit");
		System.out.println(hmap);
	LinkedHashMap<Integer,String>hmap1=new LinkedHashMap<>();
		
		//put method is used to add data
		hmap1.put(100, "sam");
		hmap1.put(101, "Ajay");
		hmap1.put(95, "ram");
		hmap1.put(100, "sujay");
		hmap1.put(96, "rohit");
		System.out.println(hmap1);
		
	TreeMap<Integer,String>hmap2=new TreeMap<>();
		
		//put method is used to add data
		hmap2.put(100, "sam");
		hmap2.put(101, "Ajay");
		hmap2.put(95, "ram");
		hmap2.put(100, "sujay");
		hmap2.put(96, "rohit");
		System.out.println(hmap2);
	}

}