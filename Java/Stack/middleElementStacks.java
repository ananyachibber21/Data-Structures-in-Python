class Stack{
	int size;
	int[] arr;
	int top;
	
	Stack(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	void push(int data) {
		if(isFull()) {
			System.out.println("Overflow Condition! Cannot push an element.");
		}
		else {
			top++;
			arr[top]=data;
			System.out.println("Pushed data: "+data);
		}
	}
	
	boolean isFull() {
		return (top==size-1);
	}
	
	boolean isEmpty() {
		return (top==-1);
	}
	
	int middleElement() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		if(size%2==0) {
			return (arr[(top/2)+1]); // return second middle element
		}
		else {
			return (arr[top/2]);
		}
	}
}
public class middleElementStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(4);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		int middle = stack.middleElement();
        System.out.println(middle);
	}

}
