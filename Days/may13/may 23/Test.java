package com.may23;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Product>a1=new ArrayList<Product>();
		//public Product(int pid, String pname, int prise, int quantity)
		a1.add(new Product(101,"speakers",2000,2));
		
		a1.add(new Product(99,"washing maschine",15000,1));
		
		a1.add(new Product(67,"LED TV",20000,1));
		
		a1.add(new Product(55,"kurta",2000,2));
		
		a1.add(new Product(50,"Tshirt",2000,2));
		
		System.out.println(a1.toString());
		
		Iterator itr=a1.iterator();
		
		while(itr.hasNext()) {
			Product pr=new Product();
			pr=(Product)itr.next();
			System.out.println(pr.pid+" "+pr.pname+" "+pr.prise+" "+pr.quantity);
		}
		System.out.println("Enhanced for loop");
		//for(datatype variablename:listname)
		for(Product i:a1) {
			//get(int index)
			System.out.println(i);
		}
		
	}

}