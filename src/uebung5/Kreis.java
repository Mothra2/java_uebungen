package uebung5;

/**
 * @author Jörg Holger, 550352
 */

public class Kreis extends Figur {
	
	private double radius;
	
	public Kreis() {
	}
	
	public Kreis(Punkt p, double r) {
		super(p);
		radius = r;
	}
	
	public double getRadius() {	
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double berechneFlaeche() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double berechneUmfang() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "Kreis:"
				+"+Anker: " +getAnker() +"\n"
				+"Radius: " +radius +"\n"
				+"Fläche: " +berechneFlaeche() +"\n"
				+"Umfang: " +berechneUmfang() +"\n";
	}
	
}
