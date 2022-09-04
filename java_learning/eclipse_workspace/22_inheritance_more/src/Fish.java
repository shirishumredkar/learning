
public class Fish extends Animal {

	 protected char liveinwater;
	 protected boolean hasgill;
	 
	 //Constructor 
	 public Fish(float height, float weight, String animaltype, String bloodtype, char liveinwater, boolean hasgill) 
	 {
		super(height, weight, animaltype, bloodtype);
		this.liveinwater = liveinwater;
		this.hasgill = hasgill;
	 }
	 
	}
