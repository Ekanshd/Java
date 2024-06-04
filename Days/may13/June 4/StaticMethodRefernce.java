package com.jun4;

interface Message1{
	void info();
	
	default void s1() {
		System.out.println("This is s1 method");
	}
}
class M1 {
	static void infomessage() {
		System.out.println("This is information about class message");
	}
	
}
public class StaticMethodRefernce {

	public static void main(String[] args) {
		
		Message1 msg=M1::infomessage	;
		msg.info();
		msg.s1();

	}

}
