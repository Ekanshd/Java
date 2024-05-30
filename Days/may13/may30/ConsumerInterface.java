package com.may30;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
interface Cat{
	void eat();
}
public class ConsumerInterface {

	public static void main(String[] args) {
		Cat c=()->System.out.println("CAt is eating");
		
		c.eat();
		//Consumer interface
		Consumer<String>c1=i->System.out.println(i);
		
		c1.accept("Hello");
		//BiConsumer Interface
		BiConsumer<Integer,Integer>b1=(i,j)->System.out.println(i+j);
		
		b1.accept(10, 20);

	}

}