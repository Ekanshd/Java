package Assignments;
class Parent{
	public void pshow() {
		System.out.println("This is Parent class Method");
	}
}
class Child extends Parent{
	public void ashow() {
		System.out.println("This is child class Method");
	}
}
public class AssignmentOfInheritance {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Child a1 =new Child();
		
		p1.pshow();
		a1.ashow();
		a1.pshow();
		
	}

}
