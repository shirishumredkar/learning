
public class Crocodile extends Reptile{

	// Constructor
	public Crocodile(float height, float weight, String animaltype, String bloodtype, boolean dryskin, boolean backbone) {
		super(height, weight, animaltype, bloodtype, dryskin, backbone);
		eggtype = "hardshelled";
	}
    
	public void showInfo() {
		System.out.println("Animal [height=" + height + ", weight=" + weight + ", animaltype=" + animaltype + 
				", bloodtype="+ bloodtype + ", eggtype="+ eggtype +"]");
	}
	
	
	
}
