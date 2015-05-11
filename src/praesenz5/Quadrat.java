package praesenz5;

public class Quadrat extends Figur {

	private int breite;
	
	public Quadrat() { 
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
		
	public String toString() {
		return "Anker: " +getAnker() +"Breite: "  +breite +"Fläche: " +berechneFlaeche();
	}
}
