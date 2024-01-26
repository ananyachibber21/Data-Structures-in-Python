// To find the starting node of a cycle in a linked list (if a cycle exists)
// Use Floyd's cycle-finding algorithm

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head;

    // Initialize the object with a constructor
    List() {
        this.head = null;
    }

    // Insert a node at the end of the list
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

    // Detect the starting node of the cycle using Floyd's algorithm
    Node detectCycle() {
        Node slow = head;
        Node fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If there is a cycle, move both pointers to find the starting node
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;  // Return the starting node of the cycle
            }
        }

        return null;  // No cycle found
    }
}

public class BeginCycleNode {

    public static void main(String[] args) {
        // Example Usage
        List list = new List();

        // Insert nodes to create a linked list with a cycle
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        // Create a cycle (6th node points back to 3rd node)
        list.head.next.next.next.next.next.next = list.head.next.next;

        // Detect and print the starting node of the cycle
        Node cycleStartNode = list.detectCycle();
        System.out.println("Starting node of the cycle: " + (cycleStartNode != null ? cycleStartNode.data : "No cycle"));
    }
}
