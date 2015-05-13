package uebung5;

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
		return getLaenge() * getBreite() * Math.sin(alpha);
	}
	
	public String toString() {
		return "";
	}
}
