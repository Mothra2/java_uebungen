package uebung7;

public class Bahn implements Transportmittel {
	
	private double geschwindigkeit;
	private double passagiere;
	
	public Bahn() {
		geschwindigkeit = 0;
		passagiere = 0;
	}	
	
	public Bahn(double geschwindigkeit, int passagiere) {
		this.geschwindigkeit = geschwindigkeit;
		this.passagiere = passagiere;
	}

	@Override
	public double getGeschwindigkeit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAnzahlPlaetze() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPassagiere() {
		return passagiere;
	}

	public void setPassagiere(double passagiere) {
		this.passagiere = passagiere;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

}
