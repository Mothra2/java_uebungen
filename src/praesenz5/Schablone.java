package praesenz5;

public class Schablone extends Kreis {
	private Quadrat inQuadrat;
	
	public Schablone() {
		super();
		setInQuadrat(new Quadrat());
	}
	
	public Schablone(Punkt p, double r, int breite) {
		super(p,r);
		setInQuadrat(new Quadrat(new Punkt(p.getX()-breite/2, p.getY()-breite/2), breite));
	}
	
	public Quadrat getInQuadrat() {
		return inQuadrat;
	}
	
	public void setInQuadrat(Quadrat iq) {
		inQuadrat = iq;
	}
	
	public double berechneFlaeche() {
		return super.berechneFlaeche() - inQuadrat.berechneFlaeche();
	}
	
	public double berechneUmfang() {
		return super.berechneUmfang() + inQuadrat.berechneUmfang();
	}
	
	public String toString() {
		return "Schablone" +"\n"
				+"Anker (Kreis): " +getAnker() +"\n"
				+"Radius (Kreis): " +getRadius() +"\n"
				+"Anker (Quadrat): " 	+inQuadrat.getAnker() +"\n"
				+"Breite (Quadrat): " +inQuadrat.getBreite() +"\n"
				+"Gesamtfläche: " +berechneFlaeche() +"\n"
				+"Fläche Kreis: " +super.berechneFlaeche() +"\n"
				+"Fläche Quadrat: " +inQuadrat.berechneFlaeche() +"\n"
				+"Gesamtumfang: " +berechneUmfang() +"\n"
				+"Umfang Kreis: " +super.berechneUmfang() +"\n"
				+"Umfang Inkreis: " +inQuadrat.berechneUmfang();
		
	}
}
