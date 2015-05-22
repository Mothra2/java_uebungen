package uebung6;

/**
 * @author Jörg Holger, 550352
 */

public class Person {
	private String vorname;
	private String nachname;
	private char geschlecht;
	
	public Person(String vorname, String nachname, char geschlecht) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
	}
	
	public Person() {
		vorname = "-";
		nachname = "-";
		geschlecht = '-';
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
	public char getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	public String toString() {
		return "Vorname: " +vorname +"\n"
				+"Nachname: " +nachname +"\n"
				+"Geschlecht: " +geschlecht +"\n";
				
	}
	
	
}
