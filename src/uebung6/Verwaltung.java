package uebung6;

public class Verwaltung {

	public static Person[] listeAnlegen(Person... personen) {
		Person[] liste = new Person[personen.length];

		for (int i = 0; i < personen.length; i++) {
			liste[i] = personen[i];
		}

		return liste;
	}

	public static void listeAusgeben(Person[] liste) {
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i].toString());
		}
	}

	public static void listeSortieren(Person[] liste) { // noch implementieren
		int i = 0;
		int k = liste.length;

		while (i < k) {
			int index = i;
			int n = i + 1;

			while (n < k) {
				if (liste[index].getNachname().compareToIgnoreCase(
						liste[n].getNachname()) > 0) {
					index = n;
				}
				n++;
			}

			Person temp = liste[index];
			liste[index] = liste[i];
			liste[i] = temp;
			i++;
		}
	}

	public static int zaehleWeiblich(Person[] liste) {
		int wnr = 0;

		for (int i = 0; i < liste.length; i++) {
			if (liste[i].getGeschlecht() == 'w') {
				wnr++;
			}
		}
		return wnr;
	}
	
	public static boolean sortierTest(Person person1, Person person2) {
		// Länge des kürzeren Namens wird bestimmt und "laenge" zugewiesen
		int laenge = person1.getNachname().length();
		
		if(laenge > person2.getNachname().length()) {
			laenge = person2.getNachname().length();
		}

		boolean abbruch = false;
		boolean nachnameEinsKleiner = true;
		int j = 0;
		
		while(!abbruch && j < laenge) {
			if(person1.getNachname().charAt(j) == person2.getNachname().charAt(j)) { // wenn die verglichenen Buchstaben identisch sind, wird das nächsten Paar verglichen
				j++;
			}
			else {
				if(person1.getNachname().charAt(j) < person2.getNachname().charAt(j)) {
					abbruch = true;
				}
				else {
					nachnameEinsKleiner = false;
					abbruch = true;
				}
			}
		}
		return nachnameEinsKleiner; 
				
		//		int laenge = liste[index].getNachname().length();
		//	
		//		if(laenge > liste[n].getNachname().length()) {
		//			laenge = liste[n].getNachname().length();
		//		}
				
		//		boolean abbruch = false;
		//		boolean nachnameEinsKleiner = true;
		//		int j = 0;
		//		while(!abbruch && j < laenge) {
		//			if(liste[index].getNachname().charAt(j) == liste[index].getNachname().charAt(j) {
		//				j++;
		//			}
		//			else {
		//				if(liste[index].getNachname().charAt(j) < liste[index].getNachname().charAt(j
		//				{
		//				abbruch = true;
		//				}
		//				else {
		//				nachnameEinsKleiner = false;
		//				abbruch = true;
		//				}
				
	}	
}

