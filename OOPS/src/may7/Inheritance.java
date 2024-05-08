package com.may7;
class Product{
	int pid=101;
	String pname="Ekansh";
	String orderdate="7 may 2024";
	String recievedate="10 may 2024";
	
}
class order extends Product{
	public void disp() {
		System.out.println(pid+" "+pname+" "+orderdate+" "+recievedate);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		order o1=new order();
		o1.disp();
	}

}
