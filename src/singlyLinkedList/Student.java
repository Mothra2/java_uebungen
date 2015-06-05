package singlyLinkedList;

enum Studiengang {
		INFORMATIK,
		MATHEMATIK,
		BWL,
		ANGLISTIK,
		ROMANISTIK,
		LINGUISTIK
	}

public class Student {
	
	String vorname;
	String nachname;
	int matrikel;
	private Studiengang studiengang;
	
	public Student() {
		vorname = "Martina";
		nachname = "Musterfrau";
		matrikel = 00000;
		studiengang = Studiengang.INFORMATIK;
	}
	
	public Student(String vorname, String nachname, int matrikel, Studiengang sg) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikel = matrikel;
		this.studiengang = sg;
	}

	@Override
	public String toString() {
		return "Student [vorname=" + vorname + ", nachname=" + nachname
				+ ", matrikel=" + matrikel + ", studiengang=" + studiengang
				+ "]";
	}

	public Studiengang getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(Studiengang studiengang) {
		this.studiengang = studiengang;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getMatrikel() {
		return matrikel;
	}

	public void setMatrikel(int matrikel) {
		this.matrikel = matrikel;
	}

	
	
	
	
	
}
