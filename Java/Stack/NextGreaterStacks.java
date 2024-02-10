import java.util.Scanner;

class NextGreater{
	int size;
	int[] arr;
	int top;
	NextGreater(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	// Insert elements in the stack
	void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full. Cannot Insert");
		}
		top++;
		arr[top]=data;
		System.out.println("Element pushed: "+ data);
	}
	
	boolean isFull() {
		return (top == size-1);
	}
	
	// Check the next greater element
	// Find the next greater element for each element in the array
    int[] findGreater() {
        int[] result = new int[size]; // Array to store next greater elements
        for (int i = 0; i < size; i++) {
            result[i] = 0; // Initialize to -1 (not found)
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;	
    }
}

public class NextGreaterStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        NextGreater s = new NextGreater(size);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            s.push(element);
        }
        int[] result = s.findGreater();
        System.out.println("Next greater elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
	}
}
