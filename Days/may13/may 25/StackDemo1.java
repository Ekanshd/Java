package com.may25;

import java.util.Stack;
import java.util.Iterator; // Correct the typo here

// Define the Employee class
class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Override toString method to print Employee details
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<Employee> s = new Stack<>();

        s.push(new Employee(101, "Sam"));
        s.push(new Employee(120, "John"));
        s.push(new Employee(115, "Ajay"));
        s.push(new Employee(98, "Avni"));
        s.push(new Employee(97, "Mitesh"));
        s.push(new Employee(93, "Ajit"));

        System.out.println(s);

        System.out.println(s.peek());

        s.pop();
        System.out.println(s);

        System.out.println(s.peek());

        Iterator<Employee> itr = s.iterator(); // Correct the typo here

        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e.getId() + " " + e.getName()); // Use getters to access private fields
        }
    }
}
