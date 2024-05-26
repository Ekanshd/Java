package com.may24;

import java.util.HashMap;
import java.util.Map;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class Test2 {

    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();

        // Adding Student objects to the HashMap
        map.put(1, new Student("sam", 20));
        map.put(2, new Student("john", 15));
        map.put(3, new Student("Ajay", 25));

        // Printing the entire map
        System.out.println("Map contents: " + map);

        // Iterating through the HashMap
        System.out.println("Iterating");

        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            int key = entry.getKey();
            Student student = entry.getValue();

            System.out.println(key + " " + student.name + " " + student.age);
        }
    }
}
