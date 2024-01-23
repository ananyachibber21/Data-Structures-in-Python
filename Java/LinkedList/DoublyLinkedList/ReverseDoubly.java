class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class Doubly {
	Node head;
	Node tail;
	
	Doubly(){
		this.head = null;
		this.tail = null;
	}
	
	// Insert at the end 
	void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
		}
		else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	// display the list
	void display() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	// reversing the list
	void reverse() {
		Node temp = null;
		Node  current = head;
		
		while(current!=null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if(temp!=null) {
			head = temp.prev;
		}
	}
}

public class ReverseDoubly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly d = new Doubly();
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(4);
		System.out.println("The original Doubly Linked List: ");
        d.display();
        d.reverse();
        System.out.println("The reversed Doubly Linked List: ");
        d.display();
	}

}
