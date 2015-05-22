package uebung6;

public class Verwaltung {

	public static Person[] listeAnlegen(Person... personen) {
		Person[] liste = new Person[personen.length];
		
		for(int i = 0; i < personen.length; i++) {
				liste[i] = personen[i];
		}
			
		return liste; 
	}
	
	public static void listeAusgeben(Person[] liste) {
		for(int i = 0; i < liste.length; i++) {
			System.out.println(liste[i].toString());
		}
	}

//	public static void listeSortieren(Person[] liste) { // noch implementieren
//		
//	}
	
	public static int zähleWeiblich(Person[] liste) {
		int wnr= 0;
		
		for(int i = 0; i < liste.length; i++) {
			if(liste[i].getGeschlecht() == 'w') {
				wnr++;
			}
		}
		
		return wnr;	
	}
}
