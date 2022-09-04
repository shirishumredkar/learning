public class Calculate {

	public void area() {
		System.out.println("Default area of length 5 & width 5 is "+(5*5));
	}
	
	public int area(int l,int w) {
		System.out.println("Function called with length int & width int ");
		return l*w;
	}
	
	public double area(double l,double w) {
		System.out.println("Function called with length double & width double ");
		return l*w;
	}
	
	public double area(int l,double w) {
		System.out.println("Function called with length int & width double ");
		return l*w;
	}
	
	public double area(double l,int w) {
		System.out.println("Function called with length double & width int ");
		return l*w;
	}
	
}
