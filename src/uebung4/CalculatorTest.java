package uebung4;

/**
 * @author J�rg Holger, 550352
 */

public class CalculatorTest {

	public static void testAddDoubleDouble() {
        //Autor: J�rg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode add() mit einem negativen Eingabewert mit ungerader Parit�t in Bin�rdarstellung
        //Vorbedingungen: zu testender Wert befindet sich im Bereich der Integer-Werte, ist negativ, ungerade Parit�t
        //Eingabe: -38
        //erwarteter Ausgabe:	"false"
		//Testergebnis: bestanden!
		
		System.out.println(Parity.isEvenParity(-38));
		System.out.println();
		
	}	
}
