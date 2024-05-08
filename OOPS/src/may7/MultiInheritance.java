package com.may7;
class Vehicle{
public void disp() {
	System.out.println("This is vehicle class");
}
}
class Maruti extends Vehicle
{
	public void show(int speed) {
		System.out.println("Speed of Maruti is:"+speed);
	}
	
}
class Bycycle extends Maruti{
	public void run(int speed) {
		System.out.println("Speed of Bycycle is:"+speed);
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
		Bycycle c1=new Bycycle();
		
		c1.disp();
		c1.show(100);
		c1.show(20);
	}

}
