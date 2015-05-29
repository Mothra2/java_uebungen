 package uebung6;

 /**
  * @author Jörg Holger, 550352
  */
 
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
		// Aus der Präsenzübung.
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
		// gibt zurück, welcher der Nachnamen der beiden übergebenen Personen der lexikographisch erste ist.
        //  Rückgabe true, wenn person1.Nachname lexikographisch zuerst, false, wenn person2.Nachname lexikographisch zuerst
		
		String nachname1 = person1.getNachname().toLowerCase(); // beide Nachname-String werden in Kleinbuchstaben umgewandelt, um sie korrekt vergleichen zu können
		String nachname2 = person2.getNachname().toLowerCase();
		int laengeKuerzererName = nachname1.length();
				
		if(laengeKuerzererName > nachname2.length()) { // Länge des kürzeren Namens wird bestimmt und "laenge" zugewiesen
			laengeKuerzererName = nachname2.length();
		}

		boolean abbruch = false;
		boolean nachnameEinsZuerst = true;
		int j = 0;
		
		while(!abbruch && j < laengeKuerzererName) {
		// Die Zeichen der Nachname-Strings an Index (j) werden miteinander verglichen.
        // Das geschieht so lange, bis die Strings sich in einem Zeichen unterscheiden oder der letzte Buchstabe des kürzeren Worts erreicht ist.			
		// Unterscheiden sie sich in einem Zeichen, wird verglichen, welcher Unicode-Wert der beiden Zeichen niedriger ist.
		
		  	
			if(nachname1.charAt(j) == nachname2.charAt(j)) { // sind die Zeichen am Index j identisch, wird j um 1 erhöht 
				j++;
			}
			else {
				if(nachname1.charAt(j) < nachname2.charAt(j)) { // der Unicode-Wert des verglichenen Zeichens von nachname1 ist kleiner,
					abbruch = true; 							// nachname1 liegt also lexikographisch vor nachname2
				}
				else {											// der Unicode-Wert des verglichenen Zeichens von nachname2 ist kleiner,
					nachnameEinsZuerst = false;					// nachname2 liegt also lexikographisch vor nachname1
					abbruch = true;
				}
			}
		}
		if(abbruch == false && nachname1.length() > nachname2.length()) { // entspricht ein String den ersten Zeichen des anderen Strings, 
			nachnameEinsZuerst = !nachnameEinsZuerst;                     // wird untersucht, ob nachname1 länger als nachname2 ist.										
		}                                                                 // In diesem Fall liegt nachname2 lexikograpisch vor nachname1
		return nachnameEinsZuerst; 
	}	
}

