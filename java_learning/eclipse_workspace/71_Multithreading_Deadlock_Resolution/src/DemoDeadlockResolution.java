import java.util.concurrent.locks.ReentrantLock;

public class DemoDeadlockResolution {

	public static void main(String[] args) {

		ReentrantLock lck1 = new ReentrantLock();
		ReentrantLock lck2 = new ReentrantLock();

		Thread t1 = new Thread(new Runnable() {

			boolean lckflag1 = false;
			boolean lckflag2 = false;
			boolean doneflag1 = false;
			boolean doneflag2 = false;

			@Override
			public void run() {
				while (true) {
					try {
						lckflag1 = lck1.tryLock();
						lckflag2 = lck2.tryLock();
					} finally {
						if (lckflag1 && !doneflag1) {
							lck1.unlock();
							System.out.println("Inside Lock-1 in " + Thread.currentThread().getName());
							doneflag1 = true;
						}

						if (lckflag2 && !doneflag2) {
							lck2.unlock();
							System.out.println("Inside Lock-2 in " + Thread.currentThread().getName());
							doneflag2 = true;
						}

						if (lckflag1 && lckflag2) {
							break;
						}
					}

				}

			}

		});
		
		Thread t2 = new Thread(new Runnable() {

			boolean lckflag1 = false;
			boolean lckflag2 = false;
			boolean doneflag1 = false;
			boolean doneflag2 = false;

			@Override
			public void run() {
				while (true) {
					try {
						lckflag1 = lck1.tryLock();
						lckflag2 = lck2.tryLock();
					} finally {
						if (lckflag1 && !doneflag1) {
							lck1.unlock();
							System.out.println("Inside Lock-1 in " + Thread.currentThread().getName());
							doneflag1 = true;
						}

						if (lckflag2 && !doneflag2) {
							lck2.unlock();
							System.out.println("Inside Lock-2 in " + Thread.currentThread().getName());
							doneflag2 = true;
						}

						if (lckflag1 && lckflag2) {
							break;
						}
					}

				}

			}

		});
		
		t1.start();
		t2.start();

	}
}