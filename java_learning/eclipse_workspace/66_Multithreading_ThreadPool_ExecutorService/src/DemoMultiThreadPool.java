import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultiJoin implements Runnable
{
	 private String name;
	 
	public MultiJoin(String name) {
		this.name = name;
	}

	public void statPrint()
    {
		System.out.println("Thread : "+name+" has started");
    	System.out.println("Thread : "+name+" is completed");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@Override
	public void run() {
		statPrint();		
	}
  	
}

public class DemoMultiThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executorservice = Executors.newFixedThreadPool(10);
		
		Thread t1 = new Thread(new MultiJoin("Thread : 1"));
	    Thread t2 = new Thread(new MultiJoin("Thread : 2"));
	    Thread t3 = new Thread(new MultiJoin("Thread : 3"));
	    Thread t4 = new Thread(new MultiJoin("Thread : 4"));
	    Thread t5 = new Thread(new MultiJoin("Thread : 5"));
	    Thread t6 = new Thread(new MultiJoin("Thread : 6"));
	    Thread t7 = new Thread(new MultiJoin("Thread : 7"));
	    Thread t8 = new Thread(new MultiJoin("Thread : 8"));
	    Thread t9 = new Thread(new MultiJoin("Thread : 9"));
	    Thread t10 = new Thread(new MultiJoin("Thread : 10"));
	    
	    executorservice.execute(t1);
	    executorservice.execute(t2);
	    executorservice.execute(t3);
	    executorservice.execute(t4);
	    executorservice.execute(t5);
	    executorservice.execute(t6);
	    executorservice.execute(t7);
	    executorservice.execute(t8);
	    executorservice.execute(t9);
	    executorservice.execute(t10);
	    
	    executorservice.shutdown();
	}

}
