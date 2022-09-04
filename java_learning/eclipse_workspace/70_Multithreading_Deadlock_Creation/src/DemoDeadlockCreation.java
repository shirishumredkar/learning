public class DemoDeadlockCreation  {
	
	public static void main(String[] args) {
     
		String lock1 = "lock1";
		String lock2 = "lock2";
			
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(lock1) 
				{
					System.out.println(" Locked "+lock1+" in Thread "+Thread.currentThread().getName());
					synchronized(lock2)
					{ 
						System.out.println(" Locked "+lock2+" in Thread "+Thread.currentThread().getName());
					}	
				}
				
			}
			
			
		});
		
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(lock2) 
				{
					System.out.println(" Locked "+lock1+" in Thread "+Thread.currentThread().getName());
					synchronized(lock1)
					{ 
						System.out.println(" Locked "+lock2+" in Thread "+Thread.currentThread().getName());
					}	
				}
				
			}
			
			
		});
		
		t1.start();
		t2.start();
	
  }
}