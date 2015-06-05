package SinglyLinkedList;

public interface listable {
	
	public Node createNode(Student student);
	
	public void addFirst(Student student);
	
	public void addLast(Student student);
	
	public Node getNode(int number);
	
	public void printNode(Node node);
	
	
}
