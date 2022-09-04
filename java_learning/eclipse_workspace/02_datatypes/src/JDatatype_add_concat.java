import java.math.BigDecimal;

public class JDatatype_add_concat {

	public static void main(String[] args) {
		// Double Precision Addition
		double n1  = 1.05d;
		double n2  = 2.55d; 
		System.out.println(n1+n2); // Expected output is 3.60 but received 3.5999999999999996
		
		BigDecimal n3 = new BigDecimal("1.05");
		BigDecimal n4 = new BigDecimal("2.55");
		System.out.println(n3.add(n4)); // Expected output is 3.60
		
		// String Type Casting Internally
		String s1= new String("10");
		
		
		String s2= new String("20");
		System.out.println(s1+s2); //1020
		System.out.println(s1+s2+30); // 102030
		System.out.println((10+20)+"30"); //3030
		

	}

}
