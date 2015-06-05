package singlyLinkedList;

public interface listable {
	
	public Node createNode(Student student);
	
	public void addFirst(Student student);
	
	public void addLast(Student student);
	
	public Node getNode(int number);
	
	public void printNode(Node node);
	
	public void printList();
	
	public int numberOfNodes();
	
	public void deleteNode(int node);
	
	public void deleteList();
}
