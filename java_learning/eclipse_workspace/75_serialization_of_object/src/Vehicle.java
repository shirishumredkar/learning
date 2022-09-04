import java.io.Serializable;

public class Vehicle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3371454396894564142L;
	private String vehicletype;
	private int    vehiclecount;
	
	public Vehicle(String vehicletype, int vehiclecount) {
			this.vehicletype = vehicletype;
		this.vehiclecount = vehiclecount;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public int getVehiclecount() {
		return vehiclecount;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicletype=" + vehicletype + ", vehiclecount=" + vehiclecount + "]";
	}
	
	
	
	

}
