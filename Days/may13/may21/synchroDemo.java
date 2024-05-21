package com.may21;

class App{
	 void printTable(int n) {
		 synchronized(this) {
		 
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		 }
	}
}
class MyApp extends Thread{
	Op o1;
	//Op o1=new Op();
	 MyApp (Op o1){
		this.o1= o1;
	}
	public void run() {
		o1.printTable(6);
	}
	
}
class  MyApp1  extends Thread{
	Op o1;
	 MyApp1(Op o1){
		this.o1=o1;
	}
	public void run() {
		o1.printTable(8);
	}
}
public class synchroDemo {

	public static void main(String[] args) {
	
      Op o2=new Op();
      MyApp  t1=new  MyApp (o2);
      MyApp1  t2=new  MyApp1 (o2);
      
      t1.start();
      t2.start();
      
	}

}