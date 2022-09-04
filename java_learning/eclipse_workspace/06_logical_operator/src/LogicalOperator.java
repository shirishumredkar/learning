
public class LogicalOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if ((a == b) && (a >= b)) {
			System.out.println("a is either equal to b and a is smaller the b ");
		}

		if ((a == b) || (a <= b)) {
			System.out.println("a is either equal to b or a is smaller the b ");
		}

		if (!((a == b) && (a >= b))) {
			System.out.println("a is either equal to b and a is smaller the b ");
		}

		if (true && true) {
			System.out.println("TRUE");
		}

		if (false && true) {
			System.out.println("TRUE");
		}

		if (false && false) {
			System.out.println("TRUE");
		}

		if (true && false) {
			System.out.println("TRUE");
		}

		if (!(false && false)) {
			System.out.println("TRUE");
		}

	}
}