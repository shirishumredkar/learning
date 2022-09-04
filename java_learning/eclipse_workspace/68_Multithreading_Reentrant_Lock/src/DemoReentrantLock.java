import java.util.concurrent.locks.ReentrantLock;

public class DemoReentrantLock {

	public static int vint = 0;
	public static void main(String[] args) {
		
		ReentrantLock lck  = new ReentrantLock(); 
		
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						
						lck.lock();
						for(int i=0;i<1000;i++)
						{
							//System.out.println("In Thread 1");
							DemoReentrantLock.vint = DemoReentrantLock.vint +1;
						}
						lck.unlock();
						
					}
					
				}
				);
		
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				
				lck.lock();
				for(int i=0;i<1000;i++)
				{
					//System.out.println("In Thread 2");
					DemoReentrantLock.vint = DemoReentrantLock.vint +1;
				}
				lck.unlock();
				
			}
			
		}
		);
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total Count : "+DemoReentrantLock.vint);
				
	}
}