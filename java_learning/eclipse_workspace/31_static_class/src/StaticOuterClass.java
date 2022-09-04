public class StaticOuterClass {
	
	private static int num2 = 100;
	public void callinnermethod()
	{
		System.out.println(StaticInnerClass.getValue()); // inner method reffered in outer class
	}
	int num3=StaticInnerClass.num; // Reffereing inner class variable in outer
		
	public static class StaticInnerClass {
		public static int num;   // inner Static Variable
		public static int outernum = num2; // Outer class variable accessed in inner class
		public static int getValue() // inner static method
		{
			return num;
		}
		
	}
	
}
