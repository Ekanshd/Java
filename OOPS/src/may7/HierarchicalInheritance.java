package com.may7;
class A{
	 void a() {
		System.out.println("a method");
	}
}
class B extends A{
	void b() {
		System.out.println("b method");
	}
}
class C extends A{
	void c() {
		System.out.println(" c method");
	}
}
class D extends A{
	void d() {
		System.out.println("D method");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		B bb=new B();
		C cc=new C();
		D dd=new D();
		bb.b();
		dd.d();
		cc.a();
		cc.c();
		
	

	}

}