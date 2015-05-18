package uebung5;

/**
 * @author Jörg Holger, 550352
 */

public class GeometrieTest {

	public static void main(String[] args) {

		System.out.println("Test Punkt");
		Punkt p = new Punkt(2,2);
		System.out.println(p.toString());
		p.verschiebe(2, 2);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println();
		
		
		
		System.out.println("Test Figur");
		Figur f = new Figur(new Punkt(1,1));
		System.out.println(f.toString());
		f.verschiebeAnker(1,1);
		System.out.println(f.getAnker());
		f.setAnker(new Punkt(0,0));
		System.out.println(f.getAnker());
		System.out.println();
				
		
		System.out.println("Test Kreis");
		Kreis k = new Kreis(new Punkt(0,0), 3);
//		Fast alle Methoden werden in der toString()-Methode aufgerufen
		System.out.println(k.toString());
//		Verbleibende Methoden:
		k.setRadius(5);
		System.out.println(k.getRadius());
		System.out.println();
		

		System.out.println("Test Quadrat");
		Quadrat q = new Quadrat(new Punkt(0,0),2);
//		Fast alle Methoden werden in der toString()-Methode aufgerufen
		System.out.println(q.toString());
//		Verbleibende Methoden:
		q.setBreite(1);
		System.out.println(q.getBreite());
		System.out.println();
		
		
		System.out.println("Test Ring");
		Ring ri = new Ring(new Punkt(0,0),3,2);
//		Fast alle Methoden werden in der toString()-Methode aufgerufen
		System.out.println(ri.toString());
//		Verbleibende Methoden:
		ri.setInkreisRadius(1);
		System.out.println(ri.getInkreisRadius());
		System.out.println();
		
		System.out.println("Test Schablone");
		Schablone s = new Schablone(new Punkt(0,0), 3,2);
//		Fast alle Methoden werden in der toString()-Methode aufgerufen
		System.out.println(s.toString());
//		Verbleibende Methoden:
		s.setAussenKreis(new Kreis(new Punkt(1,1),2));
		System.out.println(s.getAussenKreis());
		System.out.println();
		
		System.out.println("Test Rechteck");
		Rechteck r = new Rechteck(new Punkt(0,0),2,4);
		System.out.println(r.toString());
//		Verbleibende Methoden:
		r.setLaenge(5);
		System.out.println(r.getLaenge());
		System.out.println();
				
		System.out.println("Test Parallelogramm");
		Parallelogramm pa = new Parallelogramm(new Punkt(0,0), 3, 2, 50);
//		Fast alle Methoden werden in der toString()-Methode aufgerufen
		System.out.println(pa.toString());
//		Verbleibende Methoden:
		pa.setAlpha(10);
		System.out.println(pa.getAlpha());
		System.out.println();
	}
}