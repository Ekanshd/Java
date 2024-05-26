package com.may24;
class LinkedListAssignment {
    Node head; // head of the list

    // Linked list Node
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to append a new node at the end
    public void append(int newData) {
        // 1. Create a new node
        Node newNode = new Node(newData);

        // 2. If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // 3. Else traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // 4. Change the next of the last node
        last.next = newNode;
    }

    // Method to print the LinkedList
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    // Driver method to test the above functions
    public static void main(String[] args) {
        LinkedListAssignment linkedList = new LinkedListAssignment();

        // Appending elements to the LinkedList
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        // Print the LinkedList
        System.out.println("Linked list:");
        linkedList.printList();
    }
}
