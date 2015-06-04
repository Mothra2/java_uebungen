package uebung7;

public class Bus implements Transportmittel {
	
	private double geschwindigkeit;
	private int plaetze;
	
	public Bus() {
		geschwindigkeit = 0;
		plaetze = 0;
	}
	
	public Bus(double geschwindigkeit, int plaetze) {
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
		return plaetze;
	}
	
	public void setAnzahlPlaetze(int plaetze) {
		this.plaetze = plaetze;
	}
}
