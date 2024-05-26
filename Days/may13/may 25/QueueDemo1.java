package com.may25;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {
	Queue<String>q=new LinkedList<>();
	
	
	q.add("red");
	q.add("white");
	q.add("white");
	q.add("Hello");

	System.out.println(q);
	/*the type of linkedlist is queue so we cant add
	 * data at perticular index number ,queue folloe FIOFO operation
	 * so bydefault elements add on the top as well as remove from the top
	 * */
	//q.add(1,"black");
	System.out.println(q.peek());
	q.add("silver");
	System.out.println(q);

	System.out.println(q.peek());
	q.remove();

	System.out.println(q);
	System.out.println("Using enhanced for loop");
	for(String s:q) {
		System.out.println(s);
	}
	
	System.out.println("Using  for while loop");
	Iterator<String>itr=q.iterator();

	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}