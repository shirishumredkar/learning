
public class RunVehicle {

	public static void main(String[] args) {

		String enginetype_out;
		Mercedes mr = new Mercedes("High","Bose","voltas","Medium",4,"Petrol");
		Truck    tr = new Truck("Tata","Heavy",4,"Diesel");
		
		enginetype_out = mr.getEngine("Test Engine Mercedes");
		System.out.println(mr);
		System.out.println(enginetype_out);
		enginetype_out = tr.getEngine("Test Engine Truck ");
		System.out.println(tr);
		System.out.println(enginetype_out);

	}

}
