package com.may9;

class Post{
	
	int pid;
	
	String pname;
	boolean published;
	
	Post(){
		System.out.println("This is No argument constructor");
	}
	
	Post(int pid,String pname){
		System.out.println("post Id:"+pid+"\nPost Name:"+pname);
	}
	
	Post(int pid,String pname,boolean published){
		System.out.println("post Id:"+pid+"\nPost Name:"+pname+"\n post is published or not?"+published);
	}
}
public class Costructor1 {

	public static void main(String[] args) {
		
		Post p1=new Post();
		
		Post p2=new Post(101,"java is secure",true);

	    Post p3=new Post(1,"Life is race");
	}

}