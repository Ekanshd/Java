//ConcurrentHashMap code

package com.may24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test3 {

	public static void main(String[] args) {
		HashMap<Integer,String>h1=new HashMap<>();
		
		h1.put(null, null);
		h1.put(1, "Anajna");
		System.out.println(h1);
		
		ConcurrentHashMap<Integer,String>h2=new ConcurrentHashMap<>();
		
		h2.put(null, null);
		h2.put(1, "Anajna");
		System.out.println(h2);
		
	}

}