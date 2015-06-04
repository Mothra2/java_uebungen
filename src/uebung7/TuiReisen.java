package uebung7;

public class TuiReisen implements Reiseanbieter {
	
	private final double PREISBUS = 25;
	private final double PREISBAHN = 40;
	private final double DISTANZSTRASSE = 288.2;
	private final double DISTANZSCHIENE = 310;
	private Bus bus;
	private Bahn bahn;
	
	public TuiReisen(Bus bus, Bahn bahn) {
		this.bus = bus;
		this.bahn = bahn;
	}
	
	@Override
	public boolean buchen(Kunde k, int transport) {
		switch (transport) {
			case 1: //bus
					break;
			case 2: //bahn
				break;
			case 3: //egal
				break;	
			default: System.out.println("Bitte zulässige Option Bus(1), Bahn(2) oder Egal(3) wählen.");	
		}
		
		return false;
	}

	@Override
	public boolean buchen(Kunde[] gruppe, int transport) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void buchungBestaetigen(Kunde k, int transport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buchungAblehnen(Kunde k, int transport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean stornieren(Kunde k, int transport) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stornoBestaetigen(Kunde k, int transport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stornoAblehnen(Kunde k, int transport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double preisErfragen(Kunde k, int transport) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dauerErfragen(Kunde k, int transport) {
		// TODO Auto-generated method stub
		return 0;
	}

}
