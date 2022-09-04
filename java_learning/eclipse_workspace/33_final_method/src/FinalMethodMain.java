
public class FinalMethodMain {

	public static void main(String[] args) {
		
	    //This is normal flow of Inheritance + Polymorphism if final is not used
		BirdChild bc = new BirdChild("Bird","Parrot-chintu");
		bc.MessageAnimal();
		AnimalParent bc1 = new BirdChild("Bird","Parrot-chintu");
		bc1.MessageAnimal();
		AnimalParent ap = new AnimalParent("Bird");
		ap.MessageAnimal();
		
		 /*
		 * Output without final 
		 * Parent Animal Type Bird Bird Name is Parrot-chintu 
		 * Parent Animal Type BirdBird  Name is Parrot-chintu 
		 * Parent Animal Type Bird
		 * 
		 * Output with Final
		 * Parent Animal Type Bird
		 * Parent Animal Type Bird
		 * Parent Animal Type Bird
		 */
	}

}
