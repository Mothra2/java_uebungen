package uebung6;

/**
 * @author Jörg Holger, 550352
 */

public class Student extends Person {
	private int matnr;
	
	public Student(String vorname, String nachname, char geschlecht, int matnr) {
		super(vorname, nachname, geschlecht);
		this.matnr = matnr;
	}
		
	public Student() {
		super();
		matnr = 0;
	}
	
	public int getMatnr() {
		return matnr;
	}
	
	public void setMatnr(int matnr) {
		this.matnr = matnr;
	}
	
	public String toString() {
		return super.toString()
				+"Matrikelnummer: " +matnr +"\n";
	}
}
