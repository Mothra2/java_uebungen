package uebung7;

public class Bahn implements Transportmittel {
	
	private double geschwindigkeit;
	private int plaetze;
	
	public Bahn() {
		geschwindigkeit = 0;
		plaetze = 0;
	}	
	
	public Bahn(double geschwindigkeit, int plaetze) {
		this.geschwindigkeit = geschwindigkeit;
		this.plaetze = plaetze;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}
	
	public void setGeschwindigkeit(double geschwindigkeit) {
			this.geschwindigkeit = geschwindigkeit;
	}

	public int getAnzahlPlaetze() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setAnzahlPlaetze(int plaetze) {
		this.plaetze = plaetze;
	}
}


