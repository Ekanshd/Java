package com.apr30;
/*local variable we can within block*/
public class Test1 {

	int a= 10;
	static int balance= 999;
	public void show() {
		String msg= "hi h r u ";
		System.out.println(msg);   //loacl variable
	}
	public static void msg() {
		String name="Ekans Develekar";
		int age=22;         //instance variable
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		 //System.out.println(msg);
		Test1 t=new Test1();
		t.show();   //instance variable
		Test1.msg();
		System.out.println(t.a);
		System.out.println(Test1.balance);
	}

}
