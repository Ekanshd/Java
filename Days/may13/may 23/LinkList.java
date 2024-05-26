package com.may23;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		
		LinkedList<String>l1=new LinkedList<String>();
		
		l1.add("Red");
		l1.add("Yellow");
		
		System.out.println(l1);
		l1.add("white");
		System.out.println(l1);
		l1.addFirst("black");
		l1.addLast("gray");
		System.out.println(l1);
		
		l1.add(2,"brown");
		System.out.println(l1);
		
		LinkedList<String>l2=new LinkedList<String>();
		l2.add("blue");
		l2.add("purple");
		
		l1.addAll(l2);
		System.out.println(l1);
		
		l1.addAll(1, l2);
		System.out.println(l1);
		
		l1.set(3, "lightred");
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		//bydefault it remove first element 
		l1.remove();
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
	}

}