interface Lambda {
   public abstract void demo();
}

public class DemoLambdaBasic {

	public static void main(String[] args) {
		        Lambda lambda   = ()-> { 
		        	System.out.println("Shirish");
		        	System.out.println("Umredkar");
		        };
		        lambda.demo();
		        
		        Thread t1 = new Thread(()->System.out.println("*******"));
		        t1.start();
		        
	}

}
