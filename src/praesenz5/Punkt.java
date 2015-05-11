package praesenz5;

public class Punkt {
	private int x;
	private int y;
	
	public Punkt() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void verschiebe(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public String toString() {
		return "x: " +x +" y: " +y; 
	}
}