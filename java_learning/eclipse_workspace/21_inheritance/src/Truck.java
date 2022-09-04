public class Truck extends Vehicle {
    
	private String company;

	// Getter Setter
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

		
	// Constructor
	public Truck(String company,String vehicletype, int wheel, String enginetype) {
		super(vehicletype, wheel, enginetype);
		this.company = company;
	}
	
	// Implementation Method
		public String getEngine(String enginetype) {
			return enginetype;
		}
	
		@Override
		public String toString() {
			return  "Truck [company=" + getCompany() + "]"         +
					"Vehicle [Wheel=" + getWheel() + "]"             +
					"Vehicle [vehicletype=" + getVehicletype() + "]" +
					"Vehicle [enginetype=" + getEnginetype() + "]" ;
		}
		
}
