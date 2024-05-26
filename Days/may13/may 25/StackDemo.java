package com.may25;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack <Integer>s=new Stack<Integer>();
		
		
		s.push(10);   //100  5index
		s.push(20);   //50  4index
		s.push(30);  //40  3index
		s.push(40);  //30  2index 
		s.push(50);  //20  1 index
		s.push(100); //10   0index
		System.out.println(s);
		System.out.println(s.get(0));
		//peek() method is used to check top element from the stack
		System.out.println(s.peek());
		s.push(500);
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		System.out.println(s.size());
		
		
		
		
		
	}

}