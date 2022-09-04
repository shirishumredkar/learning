public class StaticMethodMain {

	public static void main(String args[]) {
		
	
	int out;
	StaticMethod.num =5;
	out = StaticMethod.getValue();
	System.out.println(out);
	StaticMethod.num =10;
	out = StaticMethod.getValue();
	System.out.println(out);
	}
}
