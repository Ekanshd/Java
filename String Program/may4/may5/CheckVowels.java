package com.may5;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();					

        // Convert the input string to lower case for case-insensitive matching
        input = input.toLowerCase();

        // Initialize a counter to keep track of the number of vowels
        int vowelCount = 0;

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel (a, e, i, o, or u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Close the scanner
        sc.close();

        // Display the result
        System.out.println("Number of vowels in the input string: " + vowelCount);
    }
}
