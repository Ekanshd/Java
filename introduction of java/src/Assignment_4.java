package Assignments;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First man age:");
		
		 int x=sc.nextInt();
		 
		 System.out.println("Enter Second man age:");
			
		 int y=sc.nextInt();
		 
		 System.out.println("Enter Third man age:");
			
		 int z=sc.nextInt();
		 
		 if(x<y && x<z) {
			 System.out.println("First Man is younger");
		 }
		 else if(y<z && y<x){
			 System.out.println("Second person is younger");
		 }
		 else if(z<x && z<y){
			 System.out.println("Third person is younger");
		 }
		 else if(x>y && x>z){
			 System.out.println("First person is older");
		 }
		 else if(y>z && y>x){
			 System.out.println("Second person is older");
		 }
		 else if(z>x && z<y){
			 System.out.println("Third person is older");
		 }
		 
	}

}
