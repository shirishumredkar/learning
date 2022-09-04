
public class Mercedes extends Car {
	
	private String carclass ;

	// Getter Setter
	public String getCarclass() {
		return carclass;
	}

	public void setCarclass(String carclass) {
		this.carclass = carclass;
	}

	// Constructor
	public Mercedes(String carclass,String musicsystem, String fridge, String vehicletype, int wheel, String enginetype) 
	{
		super(musicsystem, fridge, vehicletype, wheel, enginetype);
		this.carclass = carclass; 
				
	}
	
	// Implementation Method
	public String getEngine(String enginetype) {
		return enginetype;
	}

	@Override
	public String toString() {
		return  "Mercedes [carclass=" + getCarclass() + "]"      +
				"Car [musicsystem=" + getMusicsystem() + "]"     +
				"Car [fridge=" + getFridge() + "]"               +
				"Vehicle [wheel=" + getWheel() + "]"             +
				"Vehicle [vehicletype=" + getVehicletype() + "]" +
				"Vehicle [enginetype=" + getEnginetype() + "]" ;
	}
	

}
