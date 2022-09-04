
public class StaticClassMain {

	public static void main(String[] args) {
		
		 int out;
		 StaticOuterClass.StaticInnerClass.num =5; // Static Inner class variable
		 out = StaticOuterClass.StaticInnerClass.getValue(); // Static Inner class method
		 System.out.println(out);
		 StaticOuterClass.StaticInnerClass.num =10; // Static Inner class variable assignment 
		 out = StaticOuterClass.StaticInnerClass.getValue(); // Static Inner class method
		 System.out.println(out);
		 
		 System.out.println(StaticOuterClass.StaticInnerClass.outernum); // Referreing Outer class variable inside inner class
		 
		 StaticOuterClass soc = new StaticOuterClass();
		 soc.callinnermethod(); // Reffering inner class method in call to outer class method
		 
		 System.out.println(soc.num3); // Reffering inner class variable in call to outer class variable
		 
		
	}

}
