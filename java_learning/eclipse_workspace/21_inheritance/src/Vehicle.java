public class Vehicle {
	
	private String vehicletype;
	private int    wheel;
	private String enginetype;
	
	// Constructor
	public Vehicle(String vehicletype,int wheel,String enginetype)
	{
		this.vehicletype = vehicletype;
		this.wheel = wheel;
		this.enginetype = enginetype;
	}

	// Getter Setter 
	public void setVehicletype(String vehicletype)
	{
		this.vehicletype = vehicletype;
	}
	
	public String getVehicletype()
	{
		return this.vehicletype;
	}
	
	public void setWheel(int wheel)
	{
		this.wheel = wheel;
	}
	
	public int getWheel()
	{
		return this.wheel;
	}
	
	public void setEnginetype(String enginetype)
	{
		this.enginetype = enginetype;
	}
	
	public String getEnginetype()
	{
		return this.enginetype;
	}

	
	// Implementation Method
	public String getEngine(String enginetype) {
		return enginetype;
	}
	
	
	
}
