class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCircular {
    Node head;
    Node tail;
    
    DoublyCircular() {
        this.head = null;
        this.tail = null;
    }
    
    // Insert at the beginning
    void insertAtBeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head; // Update the circular link
        }
    }
    
    // Insert at the ending
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head; // Update circular link for single node
            head.prev = head; // Update circular link for single node
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head; // Update the circular link
            head.prev = tail; // Update the circular link
        }
    }
    
    // Delete a Node
    void deleteNode(int key) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                if (current == head && current == tail) {
                    head = tail = null; // List becomes empty
                } else if (current == head) {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Node with key " + key + " deleted.");
                return;
            }
            current = current.next;
        }
        
        System.out.println("Node with key " + key + " not found in the circular linked list.");
    }
    
    // Display a Node
    void display() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class DoublyCircularLinkedList {
    public static void main(String[] args) {
        DoublyCircular list = new DoublyCircular();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtBeg(5);
        list.display();
        list.deleteNode(5);
        list.display();
    }
}
