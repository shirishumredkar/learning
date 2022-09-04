public class Typecast {

	public static void main(String[] args) {
		
		byte  b = 10;
		short s = b;
	    int   i = s;
	    long  l = i;
	    float f1 = l;
	    double d1 = f1;
	    
	    float  f = 10.512345f;
	    double d = f;
	    
	    // Implicit Type Casting   ( b -> s -> i -> l -> f1 -> d1 ) (f -> d) ( Narrowing )
	    System.out.println("Value of b  is "+b);
	    System.out.println("Value of s  is "+s);
	    System.out.println("Value of i  is "+i);
	    System.out.println("Value of l  is "+l);
	    System.out.println("Value of f1 is "+f1);
	    System.out.println("Value of d1 is "+d1);
	    
	    System.out.println("Value of f is "+f);
	    System.out.println("Value of d is "+d);
	    
	    // Explicit Type Casting ( Widening )
	    byte b1=(byte)s;
	    short s1=(short)i;
	    int i1=(int)f1;
	    float f2=(float)d1;
	    
	    System.out.println("Value of b1 is "+b1);
	    System.out.println("Value of s1 is "+s1);
	    System.out.println("Value of i1 is "+i1);
	    System.out.println("Value of f2 is "+f2);
	    
	    byte b2=(byte)d1;
	    System.out.println("Value of b2 is "+b2);
		
		
	}
}

