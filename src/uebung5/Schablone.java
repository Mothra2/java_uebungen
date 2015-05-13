package uebung5;

public class Schablone extends Quadrat {
	private Kreis aussenKreis;
	
	public Schablone() {
		super();
		setAussenKreis(new Kreis());
	}
	
	public Schablone(Punkt p, int breite, double radius) {
		super(p,breite);
		setAussenKreis(new Kreis(new Punkt(p.getX()+breite/2, p.getY()-breite/2), radius));
	}
	
	public Kreis getAussenKreis() {
		return aussenKreis;
	}
	
	public void setAussenKreis(Kreis ak) {
		aussenKreis = ak;
	}
	
	public double berechneFlaeche() {
		return aussenKreis.berechneFlaeche()-super.berechneFlaeche();
	}
	
	public double berechneUmfang() {
		return aussenKreis.berechneUmfang() + super.berechneUmfang();
	}
	
	public String toString() {
		return "Schablone" +"\n"
				+"Anker (Quadrat): " +getAnker() +"\n"
				+"Breite (Quadrat): " +getBreite() +"\n"
				+"Anker (Kreis): " +aussenKreis.getAnker() +"\n"
				+"Radius (Kreis): " +aussenKreis.getRadius() +"\n"
				+"Gesamtfläche: " +berechneFlaeche() +"\n"
				+"Fläche Quadrat: " +super.berechneFlaeche() +"\n"
				+"Fläche Kreis: " +aussenKreis.berechneFlaeche() +"\n"
				+"Gesamtumfang: " +berechneUmfang() +"\n"
				+"Umfang Quadrat: " +super.berechneUmfang() +"\n"
				+"Umfang Kreis: " +aussenKreis.berechneUmfang();
		
	}
}
