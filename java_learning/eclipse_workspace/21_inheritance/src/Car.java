public class Car extends Vehicle{
	
	private String musicsystem;
	private String fridge;

	
	// Constructor with super class
	public Car(String musicsystem, String fridge,String vehicletype,int wheel,String enginetype) {
		super(vehicletype,wheel,enginetype);
		this.musicsystem = musicsystem;
		this.fridge = fridge;
	}
	
	
	// Getter Setter
	public String getMusicsystem() {
		return musicsystem;
	}
	public void setMusicsystem(String musicsystem) {
		this.musicsystem = musicsystem;
	}
	public String getFridge() {
		return fridge;
	}
	public void setFridge(String fridge) {
		this.fridge = fridge;
	}

	// Implementation Method
		public String getEngine(String enginetype) {
			return enginetype;
		}
	
	
}
