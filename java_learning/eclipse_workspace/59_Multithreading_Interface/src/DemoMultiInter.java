class Multi implements Runnable
	{
	    void generator()
		{
		for (int i=0; i<=10;i++)
		{
			System.out.println("Value of i :"+i);
		}
		}
		@Override
		public void run() {
			generator();
		}
		
		
	
	
	}
public class DemoMultiInter {

	
	
	public static void main(String[] args) {
		
		Thread mt1 = new Thread(new Multi());
		Thread mt2 = new Thread(new Multi());
		mt1.start();
		mt2.start();
		
	}

}
