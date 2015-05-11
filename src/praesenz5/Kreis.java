package praesenz5;

public class Kreis extends Figur {
	
	private int radius;
	
	public Kreis() {
	}
	
	public Kreis(Punkt p, int r) {
		super(p);
		radius = r;
	}
	
	public int getRadius() {	
		return radius;
	}
	
	public void setRadius(int r) {
		radius = r;
	}
	
	public double berechneFlaeche() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Anker: " +getAnker() +"Radius: " +radius +"Fläche: " +berechneFlaeche();
	}
	
}
