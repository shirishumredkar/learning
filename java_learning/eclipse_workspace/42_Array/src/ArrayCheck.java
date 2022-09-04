
public class ArrayCheck {

	public static void main(String[] args) {
	
    	int[] inarrayref = new int[10]; // Initialise Array size
		inarrayref[0] = 0;
		System.out.println(inarrayref[0]);
		
		int[] inarray = {0,1,2,3,4,5,6,7,8,9}; // Proper Array Initialise
		System.out.println(inarray[1]);
		
		System.out.println("array print old way ********************* ");
		for ( int i=0; i < inarray.length;i++ )
		{
			System.out.println("array print "+inarray[i]);
		}
		
		System.out.println("array print new way ********************* ");
		
		for ( int arrynames : inarray)
		{
			System.out.println("array print "+arrynames);
		}
		
	}

}
