package uebung6;

public class ListeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] studenten = Verwaltung.listeAnlegen(new Student("Stefanie", "M�ller", 'w', 10003),
													 new Student("Thomas","Becker", 'm', 24550),
													 new Student("Silvia", "Maier", 'w', 36687),
													 new Student("Barbara", "Schuster", 'w', 23341),
													 new Student("Martin", "Becker", 'm', 52236));
		
		Person[] dozenten = Verwaltung.listeAnlegen(new Dozent("Joseph", "Weizenbaum", 'm', 100),
													new Dozent("Ada", "Lovelace", 'w', 100),
													new Dozent("Alan", "Turing", 'm', 200));

		System.out.println("Studenten vorher:");
		Verwaltung.listeAusgeben(studenten);
		Verwaltung.listeSortieren(studenten); 
		System.out.println("Studenten nachher:");
		Verwaltung.listeAusgeben(studenten);
		System.out.println("Anzahl weibliche Studenten: " +Verwaltung.zaehleWeiblich(studenten));
		
		System.out.println("\n" +"Dozenten vorher:");
		Verwaltung.listeAusgeben(dozenten);
		Verwaltung.listeSortieren(dozenten); 
		System.out.println("Dozenten nachher:");
		Verwaltung.listeAusgeben(dozenten);
		System.out.println("Anzahl weibliche Dozenten: " +Verwaltung.zaehleWeiblich(dozenten));	
		
	}
	


}