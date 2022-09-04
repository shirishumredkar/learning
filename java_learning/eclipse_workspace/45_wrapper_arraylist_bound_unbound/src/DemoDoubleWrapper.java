import java.util.*;
public class DemoDoubleWrapper {

	public static void main(String[] args) {
		
		ArrayList<Double> ad = new ArrayList<>();
		ad.add(Double.valueOf(10.0));
		System.out.println(ad.get(0).doubleValue());
		ad.add(Double.valueOf(20.3));
		System.out.println(ad.get(1).doubleValue());
	}

}
