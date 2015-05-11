package praesenz5;

public class Ring extends Kreis {
	private double inKreisRadius;
	
	public Ring(Punkt p, double r, double ir) {
		super(p,r);
		inKreisRadius = ir;
	}
	
	public void setInkreisRadius(double ir) {
		inKreisRadius = ir;
	}
	
	public double getInkreisRadius(double ir) {
		return inKreisRadius;
	}
	
	public double berechneFlaecheInkreis() {
		return Math.PI * Math.pow(inKreisRadius, 2); 
	}
	
	public double berechneFlaeche() {
//		return super.berechneFlaeche() - berechneFlaecheInkreis(); Fehler!!!
	}	
	
	public String toString() {
	return "Anker: " +getAnker() +" Radius: " +getRadius() + "Inkreisradius: " +inKreisRadius +" Gesamtfläche: " +berechneFlaeche() +"\n"
			+"Fläche Kreis: " +super.berechneFlaeche() +"Fläche Inkreis: " +berechneFlaeche();
	}
	
}