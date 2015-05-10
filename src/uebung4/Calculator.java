package uebung4;

/**
 * @author Jörg Holger, 550352
 */

public class Calculator {
		
	public static double add (double number1, double number2) {
		return number1+number2;
	}
	
	public static double sub (double number1, double number2) {
		return number1-number2;
	}
	
	public static double mul (double number1, double number2) {
		return number1*number2;
	}
	
	public static double div (double number1, double number2) {
		if(number2 != 0)
			return number1/number2;
		else
			return Double.NaN;
		
	}
			
	public static String resultString (String number1, String operator, String number2, double number3) {
		// gibt den Ergebnisstring aus, wenn das Ergebnis eine gebrochene Zahl ist
		return number1 +" " +operator +" " +number2 +" ist " +number3;
	}
	
	public static String resultString (String number1, String operator, String number2, int number3) {
		// gibt den Ergebnisstring aus, wenn das Ergebnis eine ganze Zahl ist
		return number1 +" " +operator +" " +number2 +" ist " +number3;
	}
	
	public static void calculate(String number1, String operator, String number2) {
		
		switch (operator) {
			// Die mithilfe des Parameters "operator" gewählte Methode wird aufgerufen.
			// In der if-Bedingung wird geprüft, ob es sich bei mindestens einer der beiden Zahlen
			// um eine gebrochene Zahl handelt. Ist dies der Fall, wird der Double-Rückgabewert der
			// entsprechenden Rechenmethode als Ergebnis ausgegeben. Sind beide Zahlen ganze Zahlen,
			// wird das Ergebnis als Integer gecastet und dann ausgegeben.
		
			case "add":
				if (Double.parseDouble(number1) % (int) Double.parseDouble(number1) != 0
						|| Double.parseDouble(number2) % (int) Double.parseDouble(number2) != 0) {
	
					System.out.println(resultString(
							number1,
							operator,
							number2,
							add(
									Double.parseDouble(number1),
									Double.parseDouble(number2))));
				} else {
	
					System.out.println(resultString(
							number1,
							operator,
							number2, 
							(int) add(
								Double.parseDouble(number1),
								Double.parseDouble(number2))));
				}
				break;

			case "sub":
				if (Double.parseDouble(number1) % (int) Double.parseDouble(number1) != 0
						|| Double.parseDouble(number2) % (int) Double.parseDouble(number2) != 0) {
	
					System.out.println(resultString(
							number1,
							operator,
							number2,
							sub(
								Double.parseDouble(number1),
								Double.parseDouble(number2))));
				} else {
	
					System.out.println(resultString(
							number1,
							operator,
							number2,
							(int) sub(
								Double.parseDouble(number1),
								Double.parseDouble(number2))));
				}
				break;
	
			case "mul":
				if (Double.parseDouble(number1) % (int) Double.parseDouble(number1) != 0
						|| Double.parseDouble(number2) % (int) Double.parseDouble(number2) != 0) {
	
					System.out.println(resultString(
							number1,
							operator,
							number2,
							mul(
								Double.parseDouble(number1),
								Double.parseDouble(number2))));
				} else {
	
					System.out.println(resultString(
							number1,
							operator,
							number2,
							(int) mul(
								Double.parseDouble(number1),
								Double.parseDouble(number2))));
				}
				break;
	
			case "div":
				if (Double.parseDouble(number1) % (int) Double.parseDouble(number1) != 0
						|| Double.parseDouble(number2) % (int) Double.parseDouble(number2) != 0) {
	
					System.out.println(resultString(
							number1,
							operator,
							number2,
							div(
								Double.parseDouble(number1),
								Double.parseDouble(number2))));
				} else {
	
					System.out.println(resultString(
							number1,
							operator,
							number2, (int) div(
								Double.parseDouble(number1),
								Double.parseDouble(number2))));
				}
				break;
	
			default:
				System.out.println("Bitte 'add', 'sub', 'mult' oder 'div' eingeben.");
				break;
		}

	}

	
}
