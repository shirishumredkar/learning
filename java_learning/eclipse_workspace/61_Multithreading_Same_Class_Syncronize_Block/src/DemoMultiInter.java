 class Multi implements Runnable {
	private final Object lock =new Object() ;
	void generator() {
		synchronized(lock) 
		{
	  for (int j = 0; j <= 10; j++) {	 
		for (int i = 0; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}

		}
		System.out.println();
		}
		}
	}

	@Override
	public void run() {
			generator();
			
	}

}

public class DemoMultiInter {
	public static void main(String args[]) {
		Multi mt = new Multi();
		
		Thread mt1 = new Thread(mt); 
		Thread mt2 = new Thread(mt); 
		mt1.start();
		mt2.start();
		
	}
}
