package uebung6;

public class ListeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] studenten = Verwaltung.listeAnlegen(new Student("Stefanie", "Hertel", 'w', 10301),
								new Student("Roy", "Black", 'm', 10001),
								new Student("Roberto", "Blanco", 'm', 12222),
								new Student("Jenny", "Elvers", 'w', 17122),
								new Student("Verona", "Feldbusch", 'w', 13021));
		
		Verwaltung.listeAusgeben(studenten);
//		Verwaltung.listeSortieren(studenten); // noch nicht implementiert
//		Verwaltung.listeAusgeben(studenten);
		
		Person[] dozenten = Verwaltung.listeAnlegen(new Dozent("Ada", "Lovelace", 'w', 200),
				new Dozent("Alan", "Turing", 'm', 300),
				new Dozent("Joseph", "Weizenbaum", 'm', 300));
		
		Verwaltung.listeAusgeben(dozenten);
//		Verwaltung.listeSortieren(dozenten); // noch nicht implementiert
//		Verwaltung.listeAusgeben(dozenten);
				
	}

}
