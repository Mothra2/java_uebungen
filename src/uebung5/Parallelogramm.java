package uebung5;

/**
 * @author Jörg Holger, 550352
 */

public class Parallelogramm extends Rechteck {
	double alpha;
	
	public Parallelogramm() {
		super();
		alpha = 0;
	}
	
	public Parallelogramm(Punkt p, double b, double l, double w) {
		super(p,b,l);
		alpha = w;
	}
	
	public double getAlpha() {
		return alpha;
	}
	
	public void setAlpha(double a) {
		alpha = a;
	}
	
	public double berechneFlaeche() {
		return getLaenge() * getBreite() * Math.sin(Math.toRadians(alpha));
	}
	
	public String toString() {
		return "Parallelogramm:" +"\n"
				+"Breite: " +getBreite() +"\n"
				+"Länge: " +getLaenge() +"\n" 
				+"Fläche: " +berechneFlaeche() +"\n"
				+"Umfang: " +berechneUmfang() +"\n";
	}
}
