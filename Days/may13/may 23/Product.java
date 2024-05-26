package com.may23;
public class Product {

	
	int pid;
	String pname;
	int prise;
	int quantity;
	
	public Product() {
		super();
		
	}
	public Product(int pid, String pname, int prise, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prise = prise;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", prise=" + prise + ", quantity=" + quantity + "]";
	}
	
	
}