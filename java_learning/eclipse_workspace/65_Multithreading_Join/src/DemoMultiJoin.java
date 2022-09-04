class MultiJoin
{
  	public static int count = 0;
  	
  
}

public class DemoMultiJoin {

	public static void main(String[] args) {
		
			
		
		Thread t1 = new Thread(new Runnable()
				{
				@Override
					public void run() {
					for(int i=0;i<1000;i++)
					{
						MultiJoin.count = MultiJoin.count + 1;
					}
			}
				}) ;
		
		Thread t2 = new Thread(new Runnable()
		{
		@Override
			public void run() {
			
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			    
			    for(int i=0;i<1000;i++)
			    {
			    	MultiJoin.count = MultiJoin.count + 1;
			    }
			    	
				
			}
		}
		) ;
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total Count : "+MultiJoin.count);
		

	}

}
