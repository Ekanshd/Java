package com.may24;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInputHashMap {

    public static void main(String[] args) {
        // Create a HashMap to store user input
        HashMap<String, String> userMap = new HashMap<>();

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter key-value pairs (type 'exit' to stop):");

        while (true) {
            // Prompt user for key
            System.out.print("Enter key: ");
            String key = scanner.nextLine();

            // Check if the user wants to exit
            if (key.equalsIgnoreCase("exit")) {
                break;
            }

            // Prompt user for value
            System.out.print("Enter value: ");
            String value = scanner.nextLine();

            // Store the key-value pair in the HashMap
            userMap.put(key, value);
        }

        // Close the scanner
        scanner.close();

        // Display the contents of the HashMap
        System.out.println("User input stored in HashMap:");
        for (Map.Entry<String, String> entry : userMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
