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

	public static void listeSortieren(Person[] liste) {
		//Sortieralgorithmus aus der Präsenzübung.
		int i = 0;
		
		while (i < liste.length) {
			int index = i;
			int n = i + 1;

			while (n < liste.length) {
				if (vergleicheNachname(liste[index], liste[n]) == false) {
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
		int anzahlWeiblich = 0;

		for (int i = 0; i < liste.length; i++) {
			if (liste[i].getGeschlecht() == 'w') {
				anzahlWeiblich++;
			}
		}
		return anzahlWeiblich;
	}
	
	public static boolean vergleicheNachname(Person person1, Person person2) {
		
		int laengeKuerzererName = person1.getNachname().length();
				
		if(laengeKuerzererName > person2.getNachname().length()) { // Länge des kürzeren Namens wird bestimmt und "laenge" zugewiesen
			laengeKuerzererName = person2.getNachname().length();
		}

		boolean abbruch = false;
		boolean nachnameEinsZuerst = true;
		int j = 0;
		
		while(!abbruch && j < laengeKuerzererName) {
		// Die Zeichen der Nachname-Strings von person1 und person2 an Index (j) werden miteinander verglichen. Sind die Zeichen identisch, wird j um 1 erhöht.
		// Das geschieht so lange, bis die Strings sich in einem Zeichen unterscheiden oder der letzte Buchstabe des kürzeren Worts erreicht ist.			
		// Unterscheiden sie sich in einem Zeichen, wird verglichen, welcher Unicode-Wert der beiden Zeichen niedriger ist.
		// Liegt der Nachname von person1 lexikalisch vor person2, bleibt nachNameEins "true" und wird zurückgegeben.
		// Liegt der Nachname von person2 lexikalisch vor person1, wird nachNameEins auf "false" gesetzt und zurückgegeben.
		  	
			if(person1.getNachname().charAt(j) == person2.getNachname().charAt(j)) {
				j++;
			}
			else {
				if(person1.getNachname().charAt(j) < person2.getNachname().charAt(j)) {
					abbruch = true;
				}
				else {
					nachnameEinsZuerst = false;
					abbruch = true;
				}
			}
		}
		if(abbruch == false && person1.getNachname().length() > person2.getNachname().length()) {
			nachnameEinsZuerst = !nachnameEinsZuerst;
		}
		return nachnameEinsZuerst; 
	}	
}

