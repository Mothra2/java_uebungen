package praesenz5;

public class Rechteck extends Quadrat {
	private int laenge;
	
	public Rechteck() {
		super();
		laenge = 0;
	}
	
	public Rechteck(Punkt p, int b, int l) {
		super(p, b);
		laenge = l;
	}
	
	public int getLaenge() {
		return laenge;
	}
	
	public void setLaenge(int i) {
		laenge = i;
	}
	
	public int berechneFlaeche() {
		return getBreite() * laenge;
	}
	
	public int berechneUmfang() {
		return 2*getBreite() + 2*laenge;
	}
	
 	public String toString() {
 		return "Breite: " +getBreite() +" Länge: " +getLaenge() +" Fläche: " +berechneFlaeche();
 	}

}
