
public class CalculateArea {

	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		
		cal.area();
		System.out.println(cal.area(1,2));
		System.out.println(cal.area(1.25d,2));
		System.out.println(cal.area(1.25d,2.25d));
		System.out.println(cal.area(2,2.25d));

	}

}
