// Once Animal class i.e. parent class is made final it cant be inherited 
public class BirdChild extends AnimalParent{
	
private String birdname;
	
     BirdChild(String animaltype,String birdname)
	{
		 super(animaltype);
    	 this.birdname=birdname;
	}
	
	/* Once we put final in Parent class the Eclipse start to complain we cant override in child */
	/*
	 * public void MessageAnimal() { System.out.println("Parent Animal Type "+
	 * getAnimaltype() + " Bird Name is " + birdname); }
	 * 
	 */}
