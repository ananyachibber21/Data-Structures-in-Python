class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	Node head;
	
	public LinkedList(){
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
	
	// Delete at a position by value
	public void deleteByValue(int data) {
			
		// Checks if linkedList is empty
		if(head==null) {
			return;
		}
			
		// Check if the value to be deleted is in the head
		if(head.data==data) {
			head = head.next;
			return;
		}
			
		// If the node to be deleted is not the head, traverse the list to find it
		Node current = head;
		while(current.next!=null && current.next.data!=data) {
			current = current.next;
		}
			
		// If the node with the specified data is found, delete it
		if(current.next!=null) {
			current.next = current.next.next;
		}
	}
	
	// Search for a value in the list
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
	
	// Display the elements in the list
	public void display() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original List:");
        list.display();
        System.out.println();
        System.out.println("Is 3 present in the list? " + list.search(3));

        list.deleteByValue(2);
        System.out.println("List after deleting 2:");
        list.display();
		

	}

}
