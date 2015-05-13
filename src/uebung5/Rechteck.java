package uebung5;

public class Rechteck extends Quadrat {
	private double laenge;
	
	public Rechteck() {
		super();
		laenge = 0;
	}
	
	public Rechteck(Punkt p, double b, double l) {
		super(p, b);
		laenge = l;
	}
	
	public double getLaenge() {
		return laenge;
	}
	
	public void setLaenge(double i) {
		laenge = i;
	}
	
	public double berechneFlaeche() {
		return getBreite() * laenge;
	}
	
	public double berechneUmfang() {
		return 2*getBreite() + 2*laenge;
	}
	
 	public String toString() {
 		return "Breite: " +getBreite() +" Länge: " +getLaenge() +" Fläche: " +berechneFlaeche();
 	}

}
