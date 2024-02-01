class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;
    int size;
    int capacity;

    Stack(int capacity) {
        this.top = null;
        this.size = 0;
        this.capacity = capacity;
    }

    // Insert into stack
    void push(int data) {
        if (isFull()) {
            System.out.println("Overflow Condition! Cannot push the element.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed element: " + data);
    }

    // Delete an element from the top
    int pop() {
        if (isEmpty()) {
            System.out.println("Underflow Condition! Cannot pop the element.");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        System.out.println("Popped element: " + value);
        return value;
    }

    // Display the top element in stack
    int peek() {
        if (isEmpty()) {
            System.out.println("Cannot find the top element. Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    boolean isEmpty() {
        return (top == null);
    }

    // Check if stack is full
    boolean isFull() {
        return (size == capacity);
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        // Creating a stack with a capacity of 5
        Stack stack = new Stack(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // Pushing more elements onto the stack
        stack.push(40);
        stack.push(50);
        stack.push(60);
    }
}
