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

class Doubly{
	Node head;
	Node tail;
	Doubly(){
		this.head = null;
		this.tail = null;
	}
	
	// Insert at the end
	void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = tail = newNode;
		}
		else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	// Counting the critical points
	int count() {
		int count = 0;
		if(head==null || head.next == null) {
			return 0;
		}
		Node current = head.next;
		while(current.next!=null) {
			if((current.data > current.prev.data && current.data > current.next.data) || (current.data < current.prev.data && current.data < current.next.data)) {
				count++;
			}
			current = current.next;
		}
		return count;
	}
	
	// Display the list
		void display() {
			Node current = head;
			while(current!=null) {
				System.out.println(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
}

public class CriticalPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly d = new Doubly();
		d.insert(1);
		d.insert(3);
		d.insert(2);
		d.insert(1);
		d.insert(5);
		d.insert(4);
		System.out.println("Original List: ");
		d.display();
		int critical_points = d.count();
		System.out.println("Numner of Critical Points: "+ critical_points);

	}

}
