package uebung7;

public class Privatperson implements Kunde {
	private String vorname;
	private String nachname;
	
	public Privatperson(String vn, String nn) {
		vorname = vn;
		nachname = nn;
	}
	
	@Override
	public String toString() {
		return "Privatperson [Vorname=" +vorname + ", Nachname="
				+nachname + "]";
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachnachme() {
		return nachname;
	}
	public void setNachnachme(String nachnachme) {
		this.nachname = nachnachme;
	}
	@Override
	public void empfangeNachricht(String nachricht) {
		// TODO Auto-generated method stub
		
	}
	
	
}
