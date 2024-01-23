import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Reverse {
    Node head;

    // method to insert at the end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // method to reverse
    void reverse() {
        Node prev = null;
        Node current = head;
        Node temp;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }

    // display the method
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // add a newline after printing the list
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.insert(0);
        r.insert(1);
        r.insert(2);
        r.insert(3);
        r.insert(4);

        System.out.println("Original List: ");
        r.display();

        r.reverse();

        System.out.println("The list after reversing: ");
        r.display();
    }
}
