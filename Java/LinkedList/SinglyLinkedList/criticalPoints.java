class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class Singly{
Node head;
	
	public Singly(){
		this.head = null;
	}
	
	//Insert at the end
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	// Count the number of critical points
	int count() {
		int count = 0;
		if(head==null || head.next == null) {
			return 0;
		}
		Node current = head.next;
		Node prev = head;
		while(current.next!=null) {
			if((current.data > prev.data && current.data > current.next.data) || (current.data < prev.data && current.data < current.next.data)) {
				count++;
			}
			prev = current;
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

public class criticalPoints {

	public static void main(String[] args) {
		Singly s = new Singly();
		s.insert(1);
		s.insert(3);
		s.insert(2);
		s.insert(1);
		s.insert(5);
		s.insert(4);
		System.out.println("Original List: ");
		s.display();
		int critical_points = s.count();
		System.out.println("Numner of Critical Points: "+ critical_points);

	}

}
