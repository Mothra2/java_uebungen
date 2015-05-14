package uebung5;

public class GeometrieTest {

	public static void main(String[] args) {
		
//		Test Ring
		Ring ri = new Ring(new Punkt(0,0),3,2);
		System.out.println(ri.toString());
		
//		Test Schablone
		Schablone s = new Schablone(new Punkt(0,0), 3,2);
		System.out.println(s.toString());

//		Test Parallelogramm
		Parallelogramm p = new Parallelogramm(new Punkt(0,0), 3, 2, 50);
		System.out.println(p.toString());
	}
}