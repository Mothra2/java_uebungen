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
	public boolean buchen(Kunde kunde, int transport) {
		switch (transport) {
			case 0:
				
						
			case 1:
				if (bus.getAnzahlPlaetze()>0) {
					bus.setAnzahlPlaetze(bus.getAnzahlPlaetze()-1);
					buchungBestaetigen(kunde, transport);
				}
				else {
					buchungAblehnen(kunde, transport);
				}
				break;
				
			case 2: 
				if (bahn.getAnzahlPlaetze()>0) {
					bahn.setAnzahlPlaetze(bahn.getAnzahlPlaetze()-1);
					buchungBestaetigen(kunde, transport);
				}
				else {
					buchungAblehnen(kunde, transport);
				}
				break;	
			default: System.out.println("Bitte zulässige Option Egal(0), Bus(1) oder Bahn(2) wählen.");	
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
		double preis = 0;
		
		switch (transport) {
		case 0: System.out.println("Bitte Bus(1) oder Bahn(2) wählen.");
		 		break;
		case 1: preis = PREISBUS;
				break;
		case 2: preis = PREISBAHN;
				break;
		default: System.out.println("Bitte ein Transportmittel angeben.");
				break;
		}
		return preis;
	}

	@Override
	public double dauerErfragen(Kunde k, int transport) {
		double dauer = 0;
		
		switch (transport) {
		case 0: System.out.println("Bitte Bus(1) oder Bahn(2) wählen.");
		 		break;
		case 1: dauer = DISTANZSTRASSE/bus.getGeschwindigkeit();
				break;
		case 2: preis = DISTANZSCHIENE/bus.getGeschwindigkeit(); 
				break;
		default: System.out.println("Bitte ein Transportmittel angeben.");
				break;
		}
		return dauer;
	}

}
