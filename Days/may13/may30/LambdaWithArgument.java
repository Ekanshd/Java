package com.may30;
interface Maths{
	void cal(int no1,int no2);
	//void show();
	
	default void show(){
		
		System.out.println("demo method");
	};
}

public class LambdaWithArgument {

	public static void main(String[] args) {
		Maths m1=(int a,int b)->System.out.println("addition:"+a+b);
		
		m1.cal(10, 20);
		
		Maths m2=(int a,int b)->System.out.println("Substraction:"+(a-b));
		m2.cal(20, 10);
		Maths m3=(int a,int b)->System.out.println("Multiplication:"+(a*b));
		m3.cal(30, 10);
		Maths m4=(int a,int b)->System.out.println("Division:"+(a/b));
		m4.cal(20, 10);
		m1.show();
		
	}

}