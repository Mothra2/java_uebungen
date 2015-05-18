package uebung5;

/**
 * @author Jörg Holger, 550352
 */

public class Punkt {
	private double x;
	private double y;
	
	public Punkt() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void verschiebe(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	public String toString() {
		return "x: " +x +" y: " +y; 
	}
}