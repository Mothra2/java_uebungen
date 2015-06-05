package singlyLinkedList;

public class SinglyLinkedList implements listable {
	Node head;
	
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
		
		Node pointer = head;
		
		for(int i=0; i<number; i++) {
			pointer = pointer.getNext();
		}
		return pointer;
	}
	
	public void printNode(Node node) {
		System.out.println(node.getStudent().toString());
	}
}
	
	

