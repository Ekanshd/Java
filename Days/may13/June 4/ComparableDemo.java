/*question
 * product{
 * pid, prise, pname quantiy 
 * conditation are:
 * 1) sort data according pname
 * 2) sort data according Prise
 * Implemnt compratar & comparable */

package com.jun4;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Product>a1=new ArrayList<>();
		a1.add(new Product(101,"Speakers",2000,2));
		a1.add(new Product(95,"Kurti",1000,4));
		a1.add(new Product(94,"LED",32000,1));
		a1.add(new Product(93,"Bag",500,1));
		a1.add(new Product(90,"Shoose",1500,1));
		
		Collections.sort(a1);
		System.out.println("After sorting using comparable");
		for(Product p1:a1) {
			System.out.println(p1.getPid()+" "+p1.getPname()+" "+p1.getPrise()+" "+p1.getQuantity());
		}

	}

}