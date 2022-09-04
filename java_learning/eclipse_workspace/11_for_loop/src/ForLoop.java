
public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Value of i is " + i);
		}

		
		int i = 0;
		for (;;) {
			if (i <= 10) {
				System.out.println("Value of i is " + i);
				break;
			}
			i++;
		}
		
		for (int k = 0; k <= 5; k++) {
			for (int l = 0; l < k; l++) {
				System.out.print('@');
			}
			System.out.println();
		}
		

		

	}

}
