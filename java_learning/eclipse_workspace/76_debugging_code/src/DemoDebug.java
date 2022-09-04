class Vehicle
{
	private String vehiclename;

	public Vehicle(String vehiclename) {
		this.vehiclename = vehiclename;
	}

	public String getVehiclename() {
		return vehiclename;
	}
	
	
	
}

public class DemoDebug {

	
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Mercedes");
		String vehiclename = v1.getVehiclename();
		System.out.println("Vehicle Name is "+vehiclename);
		
		
	}

}
