final public class AnimalParent {

	private String animaltype;
	
	AnimalParent(String animaltype )
	{
		this.animaltype=animaltype;
	}
	
	public String getAnimaltype()
	{
		return animaltype;
	}
	
	public final void MessageAnimal()
	{
		System.out.println("Parent Animal Type "+ animaltype);
	}
	
}
