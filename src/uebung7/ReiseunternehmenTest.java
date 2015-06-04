package uebung7;

public class ReiseunternehmenTest {
	
	public static void main(String[] args) {
		// Bus erzeugen. Dieser Bus fährt durchschnittlich 80 km/h und hat nur 3 Plätze
		Bus bus = new Bus(80,3);
		// Bahn erzeugen. Diese Bahn fährt durchschnittlich 120 km/h und hat 10 Plätze
		Bahn bahn = new Bahn(120,10);
		
		// Filiale von TuiReisen erzeugen. Verfügt über bus und bahn
		TuiReisen tui1 = new TuiReisen(bus, bahn);
		
		// Privatpersonen als Kunden erzeugen
		Privatperson p1 = new Privatperson("Robert", "Neumann");
		
		// Studenten als Kunden erzeugen
		Student s1 = new Student("Hans", "Maier", "HTW-Berlin");
		Student s2 = new Student("Angela", "Elbig", "HTW-Berlin");
		Student s3 = new Student("Maria", "Hellmann", "HU-Berlin");
		
		Student[] studentengruppe = {s1,s2,s3};
		
		// Robert Neumann bucht eine Reise mit dem Bus
		tui1.buchen(p1,1);
		
		// Studenten s1, s2 und s3 buchen als Gruppe eine Busreise
		tui1.buchen(studentengruppe, 1);
		
		// Studenten s1,s2 und s3 buchen als Gruppe eine Reise mit Egal
		tui1.buchen(studentengruppe, 0);
		
		// Robert Neumann erfragt Reisedauer mit Egal
		tui1.dauerErfragen(p1, 0);
		
		// Robert Neumann erfragt Reisedauer mit Bus
		tui1.dauerErfragen(p1, 1);
		
		// Robert Neumann erfragt Reisepreis mit Egal
		tui1.preisErfragen(p1, 0);
		
		// Robert Neumann erfragt Reisepreis mit Bahn
		tui1.preisErfragen(p1, 2);
				
		// Robert Neumann storniert seine Busreise
		tui1.stornieren(p1,1);
		
		// Robert Neumann bucht eine Bahnreise
		tui1.buchen(p1,2);
		
		//Studenten wollen Busreise als Gruppe stornieren
		tui1.stornieren(studentengruppe,1);
		
		//Studenten wollen Reise mit egal als Gruppe stornieren
		tui.stornieren(studentengruppe,0);
		//Studenten wollen Bahnreise als Gruppe stornieren
		tui.stornieren(studentengruppe,2);
	}

}
