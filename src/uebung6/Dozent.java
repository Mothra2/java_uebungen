package uebung6;

/**
 * @author Jörg Holger, 550352
 */

public class Dozent extends Person {
	private int kostenstelle;
	
	public Dozent(String vorname, String nachname, char geschlecht, int kostenstelle){
		super(vorname, nachname, geschlecht);
		this.kostenstelle = kostenstelle;
	}
		
	public Dozent() {
		super();
		kostenstelle = 0;
	}
	
	public int getKostenstelle() {
		return kostenstelle;
	}
	
	public void setKostenstelle(int kostenstelle) {
		this.kostenstelle = kostenstelle;
	}
	
	public String toString() {
		return super.toString()
				+"Kostenstelle: " +kostenstelle +"\n";
	}
}
