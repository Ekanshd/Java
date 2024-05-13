package Assignments;

import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the first number: ");
        String str1 = sc.nextLine();
        
       
        System.out.print("Enter the second number: ");
        String str2 = sc.nextLine();
        
       
        try {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            
            
            int result = num1 * num2;
            
           
            System.out.println("Result of multiplication: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
        
        sc.close();
    }
}

