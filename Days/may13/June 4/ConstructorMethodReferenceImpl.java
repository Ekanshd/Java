package com.jun4;

import java.util.function.Consumer;

interface Animal{
	void getInfo(String colour);
}
class Cat1{
	public Cat1(String colour){
		System.out.println("Color of cat animal is:"+colour);
	}
}
// by using consumer 
class Dog{
	public Dog(String colour) {
		System.out.println(colour);
	}
}
public class ConstructorMethodReferenceImpl {

	public static void main(String[] args) {
		Animal a1=Cat1::new;
		a1.getInfo("Brown");
		
		//by using consumer
		Consumer<String>c1=Dog::new;

		c1.accept("Black");
	}

}
