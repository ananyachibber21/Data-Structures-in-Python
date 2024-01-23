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
	
	// Inserting at the beginning
	void insertAtBeg(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			// head.prev = null; // Set head.prev to null after inserting at the beginning
		}
	}
	
	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	void deleteNode(int key) {
		Node current = head;
		while(current.next!=null && current.data!=key) {
			current = current.next;
		}
		
		if(current==null) {
			System.out.println("Node with key " + key + " not found.");
			return;
		}
		
		if(current.prev!=null) {
			current.prev.next = current.next;
		}
		else {
			head = current.next;
		}
		
		if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
	}
	
	// Displaying the doubly linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly d = new Doubly();
        d.insertAtBeg(1);
        d.insertAtEnd(2);
        d.insertAtEnd(3);

        System.out.println("Doubly Linked List after insertions:");
        d.display();

        d.deleteNode(2);

        System.out.println("Doubly Linked List after deleting node with key 2:");
        d.display();

	}

}
