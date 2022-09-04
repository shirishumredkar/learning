import java.util.function.IntPredicate;

interface Lamda {
   abstract public String demo(int y);
}

public class DemoLambdaBasic {

	public static void main(String[] args) {
		 int x =10;
		 Lamda lambda   = new Lamda() {

			@Override
			public String demo(int y) {
				System.out.println(" Value of x is "+x);
				if ( y<10 ) {
					return " Value of y is "+y;
				}
				return null;
				
			}
			 
		 };
		 String outp = lambda.demo(5);
		 System.out.println(outp);
		 IntPredicate lessthan5 = i->x<5;
		 
		 if(lessthan5.test(5))
		 {
		 System.out.println("X is less than 5");
		 }
		 else
		 {
			 System.out.println("X is greater than 5");
		 }
		 
		 
		
	}
}
