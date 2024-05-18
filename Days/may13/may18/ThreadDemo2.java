//Runnable code
package com.may18;


public class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("This is RunnAble run method");
		
	}
	public static void main(String[] args) {
		ThreadDemo2 t1=new ThreadDemo2();
		Thread t =new Thread(t1);
		t.start();

	}


	
	

}