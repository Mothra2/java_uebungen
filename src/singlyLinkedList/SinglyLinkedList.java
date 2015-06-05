package singlyLinkedList;

public class SinglyLinkedList implements listable {
	private Node head;
	
	public Node createNode(Student student) {
		Node node = new Node();
		node.setStudent(student);
		return node;
	}
		
	@Override
	public void addFirst(Student student) {
		if(head == null) { 
			head = createNode(student);
			head.setNext(null);
		}
		else {
			Node node = createNode(student);
			node.setNext(head);
			head = node;
		}
	}

	@Override
	public void addLast(Student student) {
		if(head == null) { 
			head = createNode(student);
			head.setNext(null);
		}
		else {
			Node pointer = head;
			while(pointer.getNext() != null) {
				pointer = pointer.getNext();
			}
			pointer.setNext(createNode(student));
			pointer.getNext().setNext(null);
		}
	}
	
	public Node getNode(int number) {
		if(number > 0 && number <= numberOfNodes()) {
			Node pointer = head;
			
			for(int i= 1; i < number; i++) {
				pointer = pointer.getNext();
			}
			return pointer;
		}
		else {
			System.out.println("Please enter number between 1 and " +numberOfNodes() +".");
			return null;
		}
	}
	
	public void printNode(Node node) {
		if(node != null) {
			System.out.println(node.getStudent().toString());
		}
	}	
		
	
	public void printList() {
		if(head != null) {
			if (head.getNext() == null) {
				printNode(head);
			}
			else {
				Node pointer = head;
				while (pointer != null) {
					printNode(pointer);
					pointer = pointer.getNext();
				}
			}	
		}
		else {
			System.out.println("List empty.");
		}
	}
	
	public int numberOfNodes() {
		int number = 0;
		
		if(head != null) {
			Node pointer = head;
			
			while (pointer != null) {
				number++;
				pointer = pointer.getNext();
			}
		}	
		return number;
	}
		
	public void deleteNode(int node) {
	// TODO
		if(node >= 0 && node < numberOfNodes())
			
			if (node == 0) { // 1. Node soll gelöscht werden, head wird auf 2. Element gesetzt
				head = head.getNext(); // 
			}	
			else {
				Node pointer = head;
				
				int i = 1;
				while(i < node) { // Pointer läuft bis zum (k-1). Node
					pointer = pointer.getNext();
					i++;
				}
				pointer.setNext(pointer.getNext().getNext());
			}	
		else {
			System.out.println("Please enter number between 0 and " +numberOfNodes() +".");			
		}		
	}

		
	public void deleteList() {
		head = null;
	}
	
	
}
	
	

