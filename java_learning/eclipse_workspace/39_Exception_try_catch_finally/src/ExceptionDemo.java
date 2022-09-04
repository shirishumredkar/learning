
public class ExceptionDemo {

	
	public static void main(String[] args) {
		int  a=10;
		try {
			System.out.println(" Message Before Exception Occur ");
			System.out.println(" Message During Exception "+(a/0));
		   }
        catch(Exception e){
        	//e.printStackTrace();
        	System.out.println(" Message in Catch block for  Exception Occured ");
        }
		finally {
			System.out.println(" Finally Message post Catch Block ");
		}

	}

}
