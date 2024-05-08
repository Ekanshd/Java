package com.may8;

class Course{
	private int cid=101;
	private String cname="Java Full stack";
	
	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}


}
public class EncapsulationDemoGetter {
	public static void main(String[] args) {
		Course c1=new Course();
		//System.out.println(c1.cid+" "+c1.cname);
		System.out.println(c1.getCid()+" "+c1.getCname());
	}
}
