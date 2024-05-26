package com.may24;

class LinkedlistSpecialPosition {
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

    // Method to iterate from a specified position
    public void iterateFromPosition(int position) {
        if (position < 1) {
            System.out.println("Invalid position: Position should be greater than or equal to 1.");
            return;
        }

        Node currentNode = head;
        int currentPosition = 1;

        // Traverse to the specified position
        while (currentNode != null && currentPosition < position) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        // Check if the position is out of the bounds of the list
        if (currentNode == null) {
            System.out.println("Position is out of the bounds of the list.");
            return;
        }

        // Iterate from the specified position
        System.out.println("Linked list elements starting from position " + position + ":");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    // Driver method to test the above functions
    public static void main(String[] args) {
        LinkedlistSpecialPosition linkedList = new LinkedlistSpecialPosition();

        // Appending elements to the LinkedList
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        // Iterate through the LinkedList from a specified position
        int position = 3;
        linkedList.iterateFromPosition(position);
    }
}
