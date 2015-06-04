package uebung7;

public class Bus implements Transportmittel {
	
	private double geschwindigkeit;
	private int passagiere;
	
	public Bus() {
		geschwindigkeit = 0;
		passagiere = 0;
	}
	
	public Bus(double geschwindigkeit, int passagiere) {
		this.geschwindigkeit = geschwindigkeit;
		this.passagiere = passagiere;
	
	public int getPassagiere() {
		return passagiere;
	}

	public void setPassagiere(int passagiere) {
		this.passagiere = passagiere;
	}

	@Override
	public double getGeschwindigkeit() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	
	}
	
	

	@Override
	public int getAnzahlPlaetze() {
		// TODO Auto-generated method stub
		return 0;
	}

}
