 class  Multi implements Runnable {
	volatile public static int vint =0;
	void generator() {
		
	  	while(vint==0) {
	  		System.out.println("Running");
		}
	  	
	}
	@Override
	public void run() {
		generator();
		
	}
 }

class  Change implements Runnable {
	void changeval() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Multi.vint = Multi.vint +1;
		System.out.println("Flag Updated");
		} 	

	@Override
	public void run() {
			changeval();
			
	}

}

public class DemoMultiInter {
	public static void main(String args[]) {
		Multi mt = new Multi();
		Change cmt = new Change();
		Thread mt1 = new Thread(mt); 
		Thread mt2 = new Thread(cmt); 
		mt1.start();
		mt2.start();
		
	}
}
