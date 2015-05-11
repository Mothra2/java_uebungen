package praesenz5;

public class Quadrat extends Figur {

	private int breite;
	
	public Quadrat() { 
		super();
		breite = 0;
	}
	
	public Quadrat(Punkt p, int b) {
		super(p);
		breite = b;
	}
	
	public int getBreite () {
		return breite;
	}
	
	public void setBreite (int b) {
		breite = b;
	}
	
	public int berechneFlaeche() {
		return breite * breite;
	}

	public int berechneUmfang() {
		return 4*breite;
	}
	
	public String toString() {
		return "Anker: " +getAnker() +" Breite: "  +breite +" Fläche: " +berechneFlaeche();
	}
}
