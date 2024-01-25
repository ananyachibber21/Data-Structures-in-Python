class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Circular {
    Node head;

    Circular() {
        this.head = null;
    }

    // Insert node at the end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Display the linkedList
    void display() {
        if (head == null) {
            System.out.println("Circular List is Empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Delete a node with a given key
    void delete(int key) {
        if (head == null) {
            System.out.println("Circular List is empty");
            return;
        }

        Node prev = null;
        Node current = head;

        // Checks if the key is in the head
        if (current.data == key) {
            while (current.next != head) {
                current = current.next;
            }
            head = head.next;
            current.next = head;
            System.out.println("Node with key " + key + " deleted.");
            return;
        }

        // If the node to be deleted is not in the head
        do {
            prev = current;
            current = current.next;

            if (current.data == key) {
                prev.next = current.next;
                System.out.println("Node with key " + key + " deleted.");
                return;
            }
        } while (current != head);

        System.out.println("Node with key " + key + " not found in the circular linked list.");
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Circular c = new Circular();
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.insert(4);
        c.insert(5);
        c.insert(6);

        System.out.println("The Circular List:");
        c.display();

        c.delete(1);
        c.delete(5);
        c.delete(9);

        System.out.println("The list after deletion:");
        c.display();
    }
}
