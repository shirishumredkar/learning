public class Door {

	// Class Variable
	private Lock lock;
	
	// Defined Class Lock with Constructor and getter-setter
	public class Lock
	{
		private boolean lck;
		
		public Lock(boolean lck)
		{
			this.lck = lck;
		}
		public boolean isLck() {
			return lck;
		}
		public void setLck(boolean lck) {
			this.lck = lck;
		}
	
	}
	
	// Constructor for Door class
	Door()
	{
		lock = new Lock(true) ;
	}

	// Setting value of Lock
	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
	
	// Check door details
	public void chk()
	{
		
		if ( lock.isLck() == true )
		{
			 System.out.println("Door are open");
			}
		else
		{
			System.out.println("Door are closed");
		}
	}



	
	
}
