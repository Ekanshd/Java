package Assignments;

public class Assignment_8  {
    private String name;

    // Constructor
    public Assignment_8() {
        this.name = "Unknown";
    }

    // Parameterized Constructor
    public Assignment_8(String name) {
        this.name = name;
    }

    // Method to print student's name
    public void printName() {
        System.out.println("Student's name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects of Student class
    	Assignment_8 student1 = new Assignment_8();
    	Assignment_8 student2 = new Assignment_8("John");

        // Printing names
        student1.printName(); // Output: Student's name: Unknown
        student2.printName(); // Output: Student's name: John
    }
}