package com.may21;

class Op{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		
	}
}
class MyOp extends Thread{
	Op o1;
	//Op o1=new Op();
	MyOp(Op o1){
		this.o1= o1;
	}
	public void run() {
		o1.printTable(6);
	}
	
}
class MyOp1 extends Thread{
	Op o1;
	MyOp1(Op o1){
		this.o1=o1;
	}
	public void run() {
		o1.printTable(8);
	}
}
public class SynchDemo {

	public static void main(String[] args) {
	
      Op o2=new Op();
      MyOp t1=new MyOp(o2);
      MyOp1 t2=new MyOp1(o2);
      
      t1.start();
      t2.start();
      
	}

}