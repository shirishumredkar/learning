public class Car {

	private int speed;
	private String door;
	
	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public String run(String door,int speed ) {
		if (door.equals("closed") && speed>0 ) {
			return "Car is Running";
		}
		else
		{
			return "Car is not running";
		}
	}
}
