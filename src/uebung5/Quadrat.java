package uebung5;

/**
 * @author J�rg Holger, 550352
 */

public class Quadrat extends Figur {

	private double breite;
	
	public Quadrat() { 
		super();
		breite = 0;
	}
	
	public Quadrat(Punkt p, double b) {
		super(p);
		breite = b;
	}
	
	public double getBreite () {
		return breite;
	}
	
	public void setBreite (double b) {
		breite = b;
	}
	
	public double berechneFlaeche() {
		return breite * breite;
	}

	public double berechneUmfang() {
		return 4*breite;
	}
	
	public String toString() {
		return "Anker: " +getAnker() +"\n"
				+"Breite: "  +breite+"\n"
				+"Fl�che: " +berechneFlaeche() +"\n"
				+"Umfang: " +berechneUmfang() +"\n";
	}
}
