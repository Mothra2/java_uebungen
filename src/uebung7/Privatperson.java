package uebung7;

public class Privatperson implements Kunde {
	private String Vorname;
	private String Nachnachme;
	
	@Override
	public String toString() {
		return "Privatperson [Vorname=" + Vorname + ", Nachnachme="
				+ Nachnachme + "]";
	}
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public String getNachnachme() {
		return Nachnachme;
	}
	public void setNachnachme(String nachnachme) {
		Nachnachme = nachnachme;
	}
	@Override
	public void empfangeNachricht(String nachricht) {
		// TODO Auto-generated method stub
		
	}
	
	
}
