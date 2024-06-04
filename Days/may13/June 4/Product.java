
/*question
 * product{
 * pid, prise, pname quantiy 
 * conditation are:
 * 1) sort data according pname
 * 2) sort data according Prise
 * Implemnt compratar & comparable */
package com.jun4;
public class Product implements Comparable<Product> {

	private int pid;
	private String pname;
	private int prise;
	private int quantity;
	@Override
	public int compareTo(Product o) {
		
		return this.prise-o.prise;
	}
	public Product(int pid, String pname, int prise, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prise = prise;
		this.quantity = quantity;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}