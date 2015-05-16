package uebung5;

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
		return super.berechneFlaeche() - berechneFlaecheInkreis(); // Fehler?
	}
	
	public double berechneUmfangInkreis() {
		return 2*Math.PI*inKreisRadius;
	}
	
	public double berechneUmfang() {
		return super.berechneUmfang() + berechneUmfangInkreis();
	}
	
	public String toString() {
	return "Ring" +"\n"
			+"Anker: " +getAnker() +"\n"
			+"Radius: " +getRadius() +"\n"
			+"Inkreisradius: " +inKreisRadius +"\n"
			+"Fläche Ring: " +berechneFlaeche() +"\n"
			+"Fläche Kreis: " +super.berechneFlaeche() +"\n"
			+"Fläche Inkreis: " +berechneFlaecheInkreis() +"\n"
			+"Umfang Ring: " +berechneUmfang() +"\n"
			+"Umfang Kreis: " +super.berechneUmfang() +"\n"
			+"Umfang Inkreis: " +berechneUmfangInkreis() +"\n";
	}
	
}