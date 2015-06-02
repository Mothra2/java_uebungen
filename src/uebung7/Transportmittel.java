package uebung7;
/**
* Schnittstelle Transportmittel <br>
* Klassen, die diese Schnittstelle implementieren sind konkrete Transportmittel, wie Bus, Bahn, Minibus, Sammeltaxi usw.
* @author Adrianna Alexander
* @version 1.0
*/	
public interface Transportmittel {
	/**
	 * @return Durchnittsgeschwindigkeit des Transportmittels
	 */
	public abstract double getGeschwindigkeit();
	
	/**
	 * @return Maximale Anzahl der Pl�tze (f�r die Fahrg�ste) in dem Transportmittel
	 */
	public abstract int getAnzahlPlaetze();
}
