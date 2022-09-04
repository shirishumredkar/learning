
public class Comparison {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 5;
		boolean d = true;
		boolean e = false;

		// Comparison Operator
		if (a == c) {
			System.out.println("Value of a is 5");
		}

		if (a < b) {
			System.out.println("Value of a is less than b");
		}

		if (b > a) {
			System.out.println("Value of b is greater than a");
		}

		if (a <= c) {
			System.out.println("Value of a is equal to c");
		}

		if (c >= a) {
			System.out.println("Value of a is equal to c");
		}

		if (a != b) {
			System.out.println("Value of a is not equal to b");
		}

		// Boolean Comparison Operator
		if (d) {
			System.out.println("Value of d is true");
		}
		
		if (!e) {
			System.out.println("Value of e is false");
		}
		
		if (d != e) {
			System.out.println("Value of d is true & value of e is false");
		}
	}

}
