package uebung5;

public class Figur {
	private Punkt anker;
	
	public Figur() {
		setAnker(new Punkt(0,0));
	}
	
	public Figur(Punkt p) {
		anker = p;
	}
		
	public Punkt getAnker() {
		return anker;
	}
	
	public void setAnker(Punkt p) {
		anker = p;
	}
	
	public void verschiebeAnker(int x, int y) {
		anker.verschiebe(x,y);
	}
	
	public String toString() {
		return "Anker: " +anker +"\n";
	}
		
}
