
public class Reptile extends Animal {

	protected boolean dryskin;
	protected boolean backbone;
	protected String  eggtype = "softshelled";
	
	// Constructor
	public Reptile(float height, float weight, String animaltype, String bloodtype, boolean dryskin, boolean backbone) 
	{
		super(height, weight, animaltype, bloodtype);
		this.dryskin = dryskin;
		this.backbone = backbone;
	}
	
}
