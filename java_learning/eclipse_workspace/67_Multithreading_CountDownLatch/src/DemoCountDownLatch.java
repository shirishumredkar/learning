import java.util.concurrent.CountDownLatch;

class CntDwnLatch implements Runnable
{
	private CountDownLatch latch;
	
	public CntDwnLatch(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread :"+Thread.currentThread().getName()+" has started" );
		System.out.println("Thread :"+Thread.currentThread().getName()+" is completed" );
		System.out.println("*************************************************");
		latch.countDown();
	}
	}

public class DemoCountDownLatch {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(4);
		Thread t1 = new Thread(new CntDwnLatch(latch));
		Thread t2 = new Thread(new CntDwnLatch(latch));
		Thread t3 = new Thread(new CntDwnLatch(latch));
		Thread t4 = new Thread(new CntDwnLatch(latch));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I am in Main Thread");
		
		}

}
