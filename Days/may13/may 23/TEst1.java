package com.may23;

import java.util.ArrayList;
import java.util.Scanner;

public class TEst1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the input integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter integers for the array list. Type 'done' when you are finished:");

        // Continuously read input from the user
        while (true) {
            // Read the next input
            String input = scanner.next();

            // Check if the user wants to stop
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Convert the input to an integer and add it to the list
                int number = Integer.parseInt(input);
                arrayList.add(number);
            } catch (NumberFormatException e) {
                // Handle the case where input is not a valid integer
                System.out.println("Invalid input. Please enter a valid integer or type 'done' to finish.");
            }
        }

        // Close the scanner
        scanner.close();

        // Print the final array list
        System.out.println("The final array list is: " + arrayList);
    }
}