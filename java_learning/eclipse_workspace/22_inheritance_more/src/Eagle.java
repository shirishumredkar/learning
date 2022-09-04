
public class Eagle extends Bird {

	
	public Eagle(float height, float weight, String animaltype, String bloodtype, boolean hasfeather, boolean canfly) {
		super(height, weight, animaltype, bloodtype, hasfeather, canfly);
	}

	public void showInfo() {
		System.out.println( "Eagle [hasfeather=" + hasfeather + ", canfly=" + canfly + ", height=" + height + ", weight=" + weight
				+ ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]");
	}

	
	
	
}
