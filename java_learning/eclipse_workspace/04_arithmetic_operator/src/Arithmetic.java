
public class Arithmetic {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a + b;
		int d = b - a;
		int e = a*b;
		int f = b/a;
		int g = 10;
		int h = 20;
		
		
		System.out.println("Addition of a and b is "+c);
		System.out.println("Subtraction of b from a is "+d);
		System.out.println("Multiplication of a and b is "+e);
		System.out.println("Division of b by a is "+f);
		System.out.println("Value of a is "+(a));   	// 10
		System.out.println("Value of a is "+(++a)); 	// 11
		System.out.println("Value of b is "+(b));   	// 20
		System.out.println("Value of b is "+(b++)); 	// 20
		System.out.println("Value of b is "+(b));   	// 21
		System.out.println("Value of g is "+(g));   	// 10
		System.out.println("Value of g is "+(--g)); 	// 9
		System.out.println("Value of h is "+(h));   	// 20
		System.out.println("Value of h is "+(h--)); 	// 20
		System.out.println("Value of h is "+(h));   	// 19


	}

}
