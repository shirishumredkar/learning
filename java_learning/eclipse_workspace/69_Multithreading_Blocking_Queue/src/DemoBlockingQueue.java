import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{

	private ArrayBlockingQueue<Integer> queue;
	
	public Producer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}
		@Override
		public void run() {
			while(true)
			{
				try {
					//Thread.sleep(100);
					queue.put(DemoBlockingQueue.cnt++);
					System.out.println("Number Added in Queue "+DemoBlockingQueue.cnt);
				} catch (InterruptedException e) {
					System.out.println("");
				}
				
			
			}
	    }
	}

class Consumer implements Runnable{

	private ArrayBlockingQueue<Integer> queue;
	
	public Consumer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}
		@Override
		public void run() {
			while(true)
			{
			try {
				//Thread.sleep(500);
				queue.take();
				DemoBlockingQueue.cnt--;
				System.out.println("Number Removed from Queue "+DemoBlockingQueue.cnt);
			} catch (InterruptedException e) {
				System.out.println("");
			}
			
			
			}
	    }
	}

	
	public class DemoBlockingQueue
	{
		public static int cnt = 0;
	public static void main(String[] args) {
	 
		 ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
		 Producer p1 = new Producer(queue);
		 Thread t1 = new Thread(p1);
		 t1.start();
		 Consumer c1 = new Consumer(queue);
		 Thread t2 = new Thread(c1);
		 t2.start();
		
	}

	}
