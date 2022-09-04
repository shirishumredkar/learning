
public class Bird extends Animal{

	 protected boolean hasfeather;
	 protected boolean canfly;
	 
	 // Constructor
	 public Bird(float height, float weight, String animaltype, String bloodtype, boolean hasfeather, boolean canfly)
	 {
			super(height, weight, animaltype, bloodtype);
			this.hasfeather = hasfeather;
			this.canfly = canfly;
	}
	 
	 
}
