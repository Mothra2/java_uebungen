package uebung7;

public class ReiseunternehmenTest {
	
	private

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
			
	}

}
