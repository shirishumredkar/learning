
public class Car {
	
	private String door;
	private int    speed;
	
	public Car()
	{
		this.door = "open";
		this.speed =0;
	}
	
	public Car(String door,int speed)
	{
		this.door = door;
		this.speed =speed;
	}
	
	public String getDoor()
	{
		return door;
	}
	
	public int getSpeed()
	{
		return speed;
	}

	 public String run(String door,int speed ) {
		 
		 if (door.equals("closed") && speed >0 )
		 {
			 return "Running";
		 }
		 else
		 {
			 return "Not Running";
		 }
		 
	 }
}
