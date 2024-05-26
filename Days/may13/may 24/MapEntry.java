package com.may24;

import java.util.HashMap;
import java.util.Map;

public class MapEntry {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map=new HashMap<>();
		
		map.put(10, "C");
		map.put(5, "C++");
		map.put(1, "C#");
		map.put(2, "Core Java");
		map.put(1, "C#Asp.Net");
		map.put(3, "Spring");
		System.out.println(map);
		
		System.out.println("Iterating Hashmap");
		
		//for(data type varibalename:listname)
		
		for(Map.Entry i:map.entrySet()) {
			System.out.println("keys :"+i.getKey()+" "+"Values:"+i.getValue());
		}

	}

}