class Stack {
    int size;
    int[] stackArray;
    int top;

    Stack(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    // insert into stack
    void push(int data) {
        if (isFull()) {
            System.out.println("Overflow Condition! Cannot push the element.");
            return;
        }
        top++;
        stackArray[top] = data;
        System.out.println("Pushed element: " + data);
    }

    // Delete an element from the end
    int pop() {
        if (isEmpty()) {
            System.out.println("Underflow Condition! Cannot pop the element.");
            return -1;
        }
        int value = stackArray[top];
        top--;
        System.out.println("Popped element: " + value);
        return value;
    }

    // Display the top element in stack
    int peek() {
        if (isEmpty()) {
            System.out.println("Cannot find the top element. Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    // Check if list is empty
    boolean isEmpty() {
        return (top == -1);
    }

    // Check if list is full
    boolean isFull() {
        return (top == size - 1);
    }
}

public class StackArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(40);
        stack.push(50);
        stack.push(60);
    }
}
