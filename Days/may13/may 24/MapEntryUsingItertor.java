package com.may24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEntryUsingItertor {

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
		System.out.println("Using Iterator ");
        
        Iterator itr=map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry m=(Map.Entry )itr.next();
            
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //adding the scala
        map.put(15, "scala");
        System.out.println(map);
        //removing the 3=string
        //remove method is only accessable thought key(3) only 
        map.remove(3);
        System.out.println(map);
        //clear all the input
        map.clear();
        System.out.println(map);
    }


    }
	

