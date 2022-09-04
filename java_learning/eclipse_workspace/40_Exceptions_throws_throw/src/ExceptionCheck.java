
public class ExceptionCheck  {

	class UserDefinedException extends Throwable
	{
		
	}
	public void getException() throws Exception, UserDefinedException  
	{
		int x =10;
		int y = 0;
		System.out.println("Outer Method");
		ExceptionCheck ec1 = new ExceptionCheck();
		ec1.innerException();
		System.out.println("Throw User Defined Eception from Outer block");
		throw new UserDefinedException();
	}
	
	public void innerException() throws Exception  
	{
		int x =10;
		int y = 0;
		try
		{
		System.out.println("Inner Method");
		System.out.println("Inner Division of x and y is "+(x/y));
		}
		catch( Exception e)
		{
			System.out.println("Catching Exception in innerException block");
			System.out.println("Throwing Exception to outer method");			
			throw new Exception();
		}
		
	}

	
	public static void main(String[] args) throws Exception, UserDefinedException {
		try
		{
		ExceptionCheck ec = new ExceptionCheck();
		ec.getException();
		}
		catch(UserDefinedException e)
		{
			System.out.println("Catching User Defined Exception in Main block");
			throw new Exception(); // Caught the Exception & thrown again
	    }
		
	}
}
