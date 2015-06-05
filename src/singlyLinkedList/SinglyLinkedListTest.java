package singlyLinkedList;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		
		// Neue Liste anlegen
		SinglyLinkedList list = new SinglyLinkedList();
//		System.out.println(list.numberOfNodes());
		
		// Ersten Eintrag erstellen
//		list.printList();
//		System.out.println();
//		list.addFirst(new Student("Jörg", "Holger", 550352, Studiengang.INFORMATIK));
//		list.printList();
//		System.out.println();
//		list.addFirst(new Student("Steffen", "Braun", 12345, Studiengang.LINGUISTIK));
//		list.printList();
//		System.out.println();
//		list.addFirst(new Student("Maria", "Müller", 22222, Studiengang.ANGLISTIK));
//		list.printList();
		
		// Letzten Eintrag erstellen
//		list.printList();
//		System.out.println();
		list.addLast(new Student("Jörg", "Holger", 550352, Studiengang.INFORMATIK));
//		list.printList();
//		System.out.println();
		list.addLast(new Student("Steffen", "Braun", 12345, Studiengang.LINGUISTIK));
//		list.printList();
//		System.out.println();
		list.addLast(new Student("Maria", "Müller", 22222, Studiengang.ANGLISTIK));
		list.printList();
		
		// Knoten zählen
//		System.out.println(list.numberOfNodes());
		
		// Knoten zurückgeben
		System.out.println();
		list.printNode(list.getNode(3));
	}

}