//ConcurrentHashMap code other method
package com.may24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test4 {

	public static void main(String[] args) {
		 Map<String, Long> phoneBook = new ConcurrentHashMap<String, Long>();
		 //Map<String, Long> phoneBook = new HashMap<String, Long>();
	        phoneBook.put("Vikram",8149101254L);
	        phoneBook.put("Mike",9020341211L);
	        phoneBook.put("Jim",7788111284L);

	        Iterator<String> keyIterator = phoneBook.keySet().iterator();

	        while (keyIterator.hasNext()){
	            String key = keyIterator.next();
	            if ("Vikram".equals(key)){
	                phoneBook.put("John",9220341211L);
	            }
	        }
	        System.out.println("Map Content after modification : " + phoneBook);
	    }

	}