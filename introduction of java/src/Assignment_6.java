package Assignments;

import java.util.Scanner;

public class Assignment_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        System.out.println("Maximum number: " + Max(num1, num2, num3));
        System.out.println("Minimum number: " + Min(num1, num2, num3));

        scanner.close();
    }

    // Method to find the maximum number
    public static int Max(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    // Method to find the minimum number
    public static int Min(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}