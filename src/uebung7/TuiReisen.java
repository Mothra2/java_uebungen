package uebung7;

public class TuiReisen implements Reiseanbieter {

	@Override
	public boolean buchen(Kunde k, int transport) {
		// TODO Auto-generated method stub
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
