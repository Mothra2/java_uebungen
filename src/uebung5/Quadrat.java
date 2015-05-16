package uebung5;

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
				+"Fläche: " +berechneFlaeche() +"\n"
				+"Umfang: " +berechneUmfang() +"\n";
	}
}
