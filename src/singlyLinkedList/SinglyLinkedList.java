package singlyLinkedList;

public class SinglyLinkedList implements listable {
	private Node head;
	
	public Node createNode(Student student) { //getestet
		Node node = new Node();
		node.setStudent(student);
		return node;
	}
		
	@Override
	public void addFirst(Student student) { // getestet
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
	public void addLast(Student student) { // getestet
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
	
	public Node getNode(int number) { // getestet
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
	
	public void printNode(Node node) { // getestet
		if(node != null) {
			System.out.println(node.getStudent().toString());
		}
	}	
		
	
	public void printList() { // getestet
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
	
	public int numberOfNodes() { // getestet
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
		
	public void deleteNode(int node) { // getestet
	// TODO
		if(node > 0 && node <= numberOfNodes())
			
			if (node == 1) { // 1. Node soll gelöscht werden, head wird auf 2. Element gesetzt
				head = head.getNext(); // 
			}	
			else {
				Node pointer = head;
				
				for(int i = 2; i < node; i++) { // Pointer läuft bis zum (k-1). Node
					pointer = pointer.getNext();
				}
				pointer.setNext(pointer.getNext().getNext());
			}	
		else {
			System.out.println("Please enter a number between 1 and " +numberOfNodes() +".");			
		}		
	}

		
	public void deleteList() { // getestet
		head = null;
	}
	
	public Node linearSearch(int option, String searchString) {
		switch(option) {
			case 1:	
					break;
			case 2:
					break;
			case 3:
					break;
			case 4:
					break;
			default:
		}		
				
		return null;
	}
	
	
}
	
	

