package com.may8;

abstract class Department{
	void show() {
		System.out.println("This is Dept method");
	}
	String deptName="CSE";
	abstract void disp() ;
		
	
}
class Employee extends Department{

	@Override
	void disp() {
		System.out.println("This is disp"+deptName);
		
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.disp();
		e1.show();
		
	}

}