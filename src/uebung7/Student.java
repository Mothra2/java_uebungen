package uebung7;

public class Student extends Privatperson {
	private String Hochschule;

	public String getHochschule() {
		return Hochschule;
	}

	public void setHochschule(String hochschule) {
		Hochschule = hochschule;
	}

	@Override
	public String toString() {
		return "Student [Hochschule=" + Hochschule + "]";
	}

	@Override
	public void empfangeNachricht(String nachricht) {
		// TODO Auto-generated method stub
		
	}
	
}
