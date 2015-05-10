package uebung4;

/**
 * @author Jörg Holger, 550352
 */

public class CalculatorTest {
	
	public static void testCalculateWrongOperator() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit zwei Double-Eingabewerten (als String), für die ein falscher Operator angegeben wird.
        //Vorbedingungen: 2 gebrochene Zahlen und der String "wrong" für den Operator werden übergeben. 
        //Eingabeparameter: "507.2", "wrong", "10000.234"
        //erwartete Ausgabe: "Bitte 'add', 'mul', 'mult' oder 'div' eingeben."
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateWrongOperator()");
		Calculator.calculate("1.2", "wrong", "3.6");
		System.out.println();
	}
		
	public static void testCalculateAddDoubleDouble() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit zwei Double-Eingabewerten (als String), die addiert werden.
        //Vorbedingungen: 2 gebrochene Zahlen und der Operator "add" werden als String übergeben.
        //Eingabeparameter: "507.2", "add", "10000.234"
        //erwartete Ausgabe: 507 add 10000.234 ist 10507.434
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateAddDoubleDouble()");
		Calculator.calculate("507.2", "add", "100000.234");
		System.out.println();
	}
	
	public static void testCalculateAddDoubleInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Double- und einem Integer-Eingabewert (als String), die addiert werden.
        //Vorbedingungen: 1 gebrochene,1 ganze Zahl und der Operator "add" werden als String übergeben. 
        //Eingabeparameter: "55555.1778", "add", "800"
        //erwartete Ausgabe: 55555.1778 add 800 ist 56355.1778
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateAddDoubleInteger()");
		Calculator.calculate("55555.1778", "add", "800");
		System.out.println();
	}
	
	public static void testCalculateAddIntegerDouble() {
		//Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Integer- und einem Double-Eingabewert (als String), die addiert werden.
        //Vorbedingungen: 1 ganze Zahl, 1 gebrochene Zahl und der Operator "add" werden als String übergeben. 
        //Eingabeparameter: "5000", "add", "7.445"
        //erwartete Ausgabe: 5000 add 7.445 ist 5007.445
		//Testergebnis: 
		
		System.out.println("testCalculateAddIntegerDouble()");
		Calculator.calculate("5000", "add", "7.445");
		System.out.println();
	}
	
	public static void testCalculateAddIntegerInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit 2 Integer-Eingabewerten (als String), die addiert werden.
        //Vorbedingungen: 2 ganze Zahlen und der Operator "add" werden als String übergeben. 
        //Eingabeparameter: "1654", "add", "7642"
        //erwartete Ausgabe: 1654 add 7642 ist 9296
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateAddIntegerInteger()");
		Calculator.calculate("1654", "add", "7642");
		System.out.println();
	}
	
	public static void testCalculateSubDoubleDouble() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit zwei Double-Eingabewerten (als String), die voneinander subtrahiert werden.
        //Vorbedingungen: 2 gebrochene Zahlen und der Operator "sub" werden als String übergeben.
        //Eingabeparameter: "507.2", "sub", "10000.234"
        //erwartete Ausgabe: 507 sub 10000.234 ist -99493.034
		//Testergebnis: 
		
		System.out.println("testCalculateSubDoubleDouble()");
		Calculator.calculate("507.2", "sub", "100000.234");
		System.out.println();
	}
	
	public static void testCalculateSubDoubleInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Double- und einem Integer-Eingabewert (als String), die voneinander subtrahiert werden.
        //Vorbedingungen: 1 gebrochene, 1 ganze Zahl und der Operator "sub" werden als String übergeben. 
        //Eingabeparameter: "55555.1778", "sub", "800"
        //erwartete Ausgabe: 55555.1778 sub 800 ist 54755.1778
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateSubDoubleInteger()");
		Calculator.calculate("55555.1778", "sub", "800");
		System.out.println();
	}
	
	public static void testCalculateSubIntegerDouble() {
		//Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Integer- und einem Double-Eingabewert (als String), die voneinander subtrahiert werden.
        //Vorbedingungen: 1 ganze Zahl, 1 gebrochene Zahl und der Operator "sub" werden als String übergeben. 
        //Eingabeparameter: "5000", "sub", "7.445"
        //erwartete Ausgabe: 5000 sub 7.445 ist 4992.555
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateSubIntegerDouble()");
		Calculator.calculate("5000", "sub", "7.445");
		System.out.println();
	}
	
	public static void testCalculateSubIntegerInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit 2 Integer-Eingabewerten (als String), die voneinander subtrahiert werden.
        //Vorbedingungen: 2 ganze Zahlen und der Operator "sub" werden als String übergeben. 
        //Eingabeparameter: "1654", "sub", "7642"
        //erwartete Ausgabe: 1654 sub 7642 ist -5988
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateSubIntegerInteger()");
		Calculator.calculate("1654", "sub", "7642");
		System.out.println();
	}
	
	public static void testCalculateMulDoubleDouble() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit zwei Double-Eingabewerten (als String), die multipliziert werden.
        //Vorbedingungen: 2 gebrochene Zahlen und der Operator "mul" werden als String übergeben.
        //Eingabeparameter: "507.2", "mul", "10.234"
        //erwartete Ausgabe: 507 mul 10.234 ist 5190,6848
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateMulDoubleDouble()");
		Calculator.calculate("507.2", "mul", "10.234");
		System.out.println();
	}
	
	public static void testCalculateMulDoubleInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Double- und einem Integer-Eingabewert (als String), die multipliziert werden.
        //Vorbedingungen: 1 gebrochene, 1 ganze Zahl und der Operator "mul" werden als String übergeben. 
        //Eingabeparameter: "555.1778", "mul", "8"
        //erwartete Ausgabe: 555.1778 mul 8 ist 4441,4224
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateMulDoubleInteger()");
		Calculator.calculate("555.1778", "mul", "8");
		System.out.println();
	}
	
	public static void testCalculateMulIntegerDouble() {
		//Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Integer- und einem Double-Eingabewert (als String), die multipliziert werden.
        //Vorbedingungen: 1 ganze Zahl, 1 gebrochene Zahl und der Operator "sub" werden als String übergeben. 
        //Eingabeparameter: "50", "mul", "7.4"
        //erwartete Ausgabe: 50 mul 7.4 ist 370 
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateMulIntegerDouble()");
		Calculator.calculate("50", "mul", "7.4");
		System.out.println();
	}
	
	public static void testCalculateMulIntegerInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit 2 Integer-Eingabewerten (als String), die multipliziert werden.
        //Vorbedingungen: 2 ganze Zahlen und der Operator "mul" werden als String übergeben. 
        //Eingabeparameter: "16", "mul", "76"
        //erwartete Ausgabe: 16 mul 76 ist 1216
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateMulIntegerInteger()");
		Calculator.calculate("16", "mul", "76");
		System.out.println();
	}
	
	public static void testCalculateDivDoubleZero() {
		//Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit 1 Double und 1 Integer-Eingabewert (als String), wobei der 1. Wert durch den 2. dividiert wird.
        //Vorbedingungen: Die zweite Zahl muss 0 sein. Beide Zahlen und der Operator "div" werden als String übergeben.
        //Eingabeparameter: "507.2", "div", "0"
        //erwartete Ausgabe: 507.2 div 0 ist NaN
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateDivDoubleDouble()");
		Calculator.calculate("507.2", "div", "0");
		System.out.println();
	}
	
	public static void testCalculateDivDoubleDouble() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit zwei Double-Eingabewerten (als String), wobei der 1. Wert durch den 2. dividiert wird.
        //Vorbedingungen: 2 gebrochene Zahlen und der Operator "div" werden als String übergeben.
        //Eingabeparameter: "507.2", "div", "10.2"
        //erwartete Ausgabe: 507 div 10.2 ist 49,72549019607843
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateDivDoubleDouble()");
		Calculator.calculate("507.2", "div", "10.2");
		System.out.println();
	}
	
	public static void testCalculateDivDoubleInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Double- und einem Integer-Eingabewert (als String),  wobei der 1. Wert durch den 2. dividiert wird.
        //Vorbedingungen: 1 gebrochene, 1 ganze Zahl und der Operator "div" werden als String übergeben. 
        //Eingabeparameter: "555.1778", "div", "8"
        //erwartete Ausgabe: 555.1778 div 8 ist 69,397225
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateDivDoubleInteger()");
		Calculator.calculate("555.1778", "div", "8");
		System.out.println();
	}
	
	public static void testCalculateDivIntegerDouble() {
		//Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit einem Integer- und einem Double-Eingabewert (als String), wobei der 1. Wert durch den 2. dividiert wird.
        //Vorbedingungen: 1 ganze Zahl, 1 gebrochene Zahl und der Operator "sub" werden als String übergeben. 
        //Eingabeparameter: "50", "div", "7.4"
        //erwartete Ausgabe: 50 div 7.4 ist 6,756756756756756 
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateDivIntegerDouble()");
		Calculator.calculate("50", "div", "7.4");
		System.out.println();
	}
	
	public static void testCalculateDivIntegerInteger() {
        //Autor: Jörg Holger
        //Testdatum: 09.5.2015
        //Getestet wird die Methode Calculate() mit 2 Integer-Eingabewerten (als String), wobei der 1. Wert durch den 2. dividiert wird.
        //Vorbedingungen: 2 ganze Zahlen und der Operator "div" werden als String übergeben. 
        //Eingabeparameter: "16", "div", "4"
        //erwartete Ausgabe: 16 div 4 ist 4
		//Testergebnis: bestanden!
		
		System.out.println("testCalculateDivIntegerInteger()");
		Calculator.calculate("16", "div", "4");
		System.out.println();
	}
//		
//		
//	}	
	public static void main(String[] args) {
		Calculator.calculate(args[0], args[1], args[2]);

//		Falscher-Operator-Test:
//		testCalculateWrongOperator();
		
//		Addition-Tests:
//		testCalculateAddDoubleDouble();
//		testCalculateAddDoubleInteger();
//		testCalculateAddIntegerDouble();
//		testCalculateAddIntegerInteger();
		
//		Subtraktion-Tests:
//		testCalculateSubDoubleDouble();
//		testCalculateSubDoubleInteger();
//		testCalculateSubIntegerDouble();
//		testCalculateSubIntegerInteger();
		
//		Multiplikation-Tests:
//		testCalculateMulDoubleDouble();
//		testCalculateMulDoubleInteger();
//		testCalculateMulIntegerDouble();
//		testCalculateMulIntegerInteger();

//		Division-Tests:
//		testCalculateDivDoubleZero();
//		testCalculateDivDoubleDouble();
//		testCalculateDivDoubleInteger();
//		testCalculateDivIntegerDouble();
//		testCalculateDivIntegerInteger();
		
		
	}
}