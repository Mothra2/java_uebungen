package singlyLinkedList;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		
		// Neue Liste anlegen
		SinglyLinkedList list = new SinglyLinkedList();
//		System.out.println(list.numberOfNodes());
		
		// Ersten Eintrag erstellen
//		list.printList();
//		System.out.println();
//		list.addFirst(new Student("J�rg", "Holger", 550352, Studiengang.INFORMATIK));
//		list.printList();
//		System.out.println();
//		list.addFirst(new Student("Steffen", "Braun", 12345, Studiengang.LINGUISTIK));
//		list.printList();
//		System.out.println();
//		list.addFirst(new Student("Maria", "M�ller", 22222, Studiengang.ANGLISTIK));
//		list.printList();
		
		// Letzten Eintrag erstellen
//		list.printList();
//		System.out.println();
		list.addLast(new Student("J�rg", "Holger", 550352, Studiengang.INFORMATIK));
//		list.printList();
//		System.out.println();
		list.addLast(new Student("Steffen", "Braun", 12345, Studiengang.LINGUISTIK));
//		list.printList();
//		System.out.println();
		list.addLast(new Student("Maria", "M�ller", 22222, Studiengang.ANGLISTIK));
		list.printList();
		
		// Knoten z�hlen
//		System.out.println(list.numberOfNodes());
		
		// Knoten zur�ckgeben
		System.out.println();
		list.printNode(list.getNode(3));
	}

}