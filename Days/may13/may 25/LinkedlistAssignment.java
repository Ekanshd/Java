/*List Interface is like an array, but more powerful and with more options. Think of it like a grocery list, where you can add, remove, and modify items as needed. You can even sort items.
One of the cool things about the List Interface is that it allows you to access elements by their index number. This means you can easily retrieve, update, or delete specific items in your list.
The widely used classes in List Interface are ArrayList and LinkedList.*/


package com.may25;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class LinkedlistAssignment {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();

        // Adding elements to ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Retrieving an element from ArrayList
        String fruit = arrayList.get(1); // Banana
        System.out.println("Retrieved from ArrayList: " + fruit);

        // Updating an element in ArrayList
        arrayList.set(2, "Coconut");
        System.out.println("Updated ArrayList: " + arrayList);

        // Removing an element from ArrayList
        arrayList.remove(3); // Removes "Date"
        System.out.println("ArrayList after removal: " + arrayList);

        // Sorting the ArrayList
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();

        // Adding elements to LinkedList
        linkedList.add("Elephant");
        linkedList.add("Frog");
        linkedList.add("Giraffe");
        linkedList.add("Hippo");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Retrieving an element from LinkedList
        String animal = linkedList.get(2); // Giraffe
        System.out.println("Retrieved from LinkedList: " + animal);

        // Updating an element in LinkedList
        linkedList.set(1, "Fox");
        System.out.println("Updated LinkedList: " + linkedList);

        // Removing an element from LinkedList
        linkedList.remove(0); // Removes "Elephant"
        System.out.println("LinkedList after removal: " + linkedList);

        // Sorting the LinkedList
        Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);
    }
}
