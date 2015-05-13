package uebung5;

public class GeometrieTest {

	public static void main(String[] args) {
		
//		Erzeugen Sie ein Objekt q vom Typ Quadrat. Berechnen Sie seinen Umfang. Geben Sie seinen Anker mithilfe der
//		getAnker()-Methode aus. Verschieben Sie seinen Anker um den Vektor (3,-1) im Koordinatensystem
//		und geben Sie wieder seinen Anker aus.
		
		Quadrat q = new Quadrat(new Punkt(0,0), 2);
		System.out.println(q.getAnker());
		q.verschiebeAnker(3, -1);
		System.out.println(q.getAnker());
		System.out.println();
		
//		Erzeugen Sie ein Objekt o vom Typ Kreis. Berechnen Sie den Umfang von o. Setzen Sie neu den Anker von o auf
//		den Wert (4,4) (mithilfe der setAnker()-Methode) und geben Sie den Anker mithilfe der getAnker()-Methode 
//		aus. Geben Sie den Radius von o aus.
		
		Kreis o = new Kreis(new Punkt(0,0), 2);
		System.out.println(o.berechneUmfang());
		o.setAnker(new Punkt(4,4));
		System.out.println(o.getAnker());
		System.out.println(o.getRadius());
		System.out.println();
		
//		Erzeugen Sie ein Objekt r vom Typ Rechteck. Berechnen Sie die Fläche von r mithilfe der eigenen Rechteck-Methode
//		berechneFlaeche(). Berechnen Sie dann die Fläche von r mithilfe der	Quadrat-Methode??? berechneFlaeche().
//		Verschieben Sie den Anker von r um den Vektor(4,7). Geben Sie den Anker von r mithilfe der getAnker()-Methode aus. 
//		Geben Sie die Länge und Breite von r aus.
		
		Rechteck r = new Rechteck(new Punkt(0,0), 2, 4);
		System.out.println(r.berechneFlaeche());
		System.out.println();
//		Quadrat-Methode?
		r.verschiebeAnker(4, 7);
		System.out.println(r.getAnker());
		System.out.println(r.getLaenge());
		System.out.println(r.getBreite());
		System.out.println();
	
////		Testen Sie die Klasse Dreieck!
//		Dreieck d = new Dreieck(new Punkt(0,0),3,5);
//		System.out.println(d.berechneFlaeche());
//		System.out.println(d.berechneUmfang());
//		System.out.println();
		
//		Test Ring
		Ring ri = new Ring(new Punkt(0,0),3,2);
		System.out.println(ri.berechneFlaeche());
		System.out.println();
		System.out.println(ri.berechneUmfang());
		System.out.println();
		System.out.println(ri.toString());
		
//		Test Schablone
		Schablone s = new Schablone(new Punkt(0,0), 3,2);
		System.out.println(s.berechneFlaeche());
		System.out.println(s.berechneUmfang());
		System.out.println(s.toString());

//		Test Parallelogramm
		Parallelogramm p = new praesenz5.Parallelogramm(new Punkt(0,0), 3, 2, 50);
		System.out.println(s.berechneFlaeche());
		System.out.println(s.berechneUmfang());
		System.out.println(s.toString());
	}
}