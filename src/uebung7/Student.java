package uebung7;

public class Student extends Privatperson {
	private String hochschule;
	
	public Student(String vorname, String nachname, String hochschule ) {
		super(vorname,nachname);
		this.hochschule = hochschule;
	}

	public String getHochschule() {
		return hochschule;
	}

	public void setHochschule(String hochschule) {
		this.hochschule = hochschule;
	}

	public void empfangeNachricht(String nachricht) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return super.toString() +"[Hochschule=" +hochschule +"]";
	}

		
}
