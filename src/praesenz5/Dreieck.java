package praesenz5;

public class Dreieck extends Figur {
	private int schenkel;
	private int basis;
	
	public Dreieck() {
		super(new Punkt(0,0));
		schenkel = 0;
		basis = 0;
	}
	
	public Dreieck(Punkt p, int s, int b) {
		super(p);
		schenkel = s;
		basis = b;
	}
	
	public double berechneFlaeche() {
		return (basis/2) * Math.sqrt( Math.pow(basis/2,2) + Math.pow(schenkel, 2)); // Fläche: A = 0,5 · c · h, falsches Ergebnis!
	}
	
	public double berechneUmfang() {
		return 2*schenkel+basis; // Umfang: U = 2a + c
	}
	
	
	
}
