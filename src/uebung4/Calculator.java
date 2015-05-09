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
		return number1/number2;
	}
			
	public static String resultString (String number1, String operator, String number2, double number3) {
		return number1 +" " +operator +" " +number2 +" ist " +number3;
	}
	
	public static String resultString (String number1, String operator, String number2, int number3) {
		return number1 +" " +operator +" " +number2 +" ist " +number3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (args[1]) {
		
			case "add":
				if (Double.parseDouble(args[0]) % (int) Double.parseDouble(args[0]) != 0
						|| Double.parseDouble(args[2]) % (int) Double.parseDouble(args[2]) != 0) {
	
					System.out.println(Calculator.resultString(
							args[0],
							args[1],
							args[2],
							Calculator.add(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				} else {
	
					System.out.println(Calculator.resultString(
							args[0],
							args[1],
							args[2], 
							(int) Calculator.add(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				}
				break;

			case "sub":
				if (Double.parseDouble(args[0]) % (int) Double.parseDouble(args[0]) != 0
						|| Double.parseDouble(args[2]) % (int) Double.parseDouble(args[2]) != 0) {
	
					System.out.println(Calculator.resultString(
							args[0],
							args[1],
							args[2],
							Calculator.sub(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				} else {
	
					System.out.println(Calculator.resultString(
							args[0],
							args[1],
							args[2],
							(int) Calculator.sub(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				}
				break;
	
			case "mul":
				if (Double.parseDouble(args[0]) % (int) Double.parseDouble(args[0]) != 0
						|| Double.parseDouble(args[2]) % (int) Double.parseDouble(args[2]) != 0) {
	
					System.out.println(Calculator.resultString(
							args[0],
							args[1],
							args[2],
							Calculator.mul(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				} else {
	
					System.out.println(Calculator.resultString(
							args[0],
							args[1],
							args[2],
							(int) Calculator.mul(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				}
				break;
	
			case "div":
				if (Double.parseDouble(args[0]) % (int) Double.parseDouble(args[0]) != 0
						|| Double.parseDouble(args[2]) % (int) Double.parseDouble(args[2]) != 0) {
	
					System.out.println(Calculator.resultString(
							args[0],
							args[1],
							args[2],
							Calculator.div(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				} else {
	
					System.out.println(Calculator.resultString(args[0],
							args[1],
							args[2], (int) Calculator.div(
									Double.parseDouble(args[0]),
									Double.parseDouble(args[2]))));
				}
				break;
	
			default:
				System.out.println("Bitte 'add', 'sub', 'mult' oder 'div' eingeben.");
				break;
		}

	}

	
}
