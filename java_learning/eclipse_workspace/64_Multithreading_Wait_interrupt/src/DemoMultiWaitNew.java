class Banking 
{
	public static int balance = 0;
	
	synchronized public void withdraw(int withamt)
	{
		System.out.println("Withdraw : Current Balance is  "+balance) ;
		if(balance<2000)
		{
			System.out.println("Withdrawl Amount is less than balance") ; 
			try {
				wait();
			} catch (InterruptedException e) {
				balance = balance - withamt;
				System.out.println("Updated Balance post Witdrawl is "+balance) ; 
			}
		}
		
	}
	
	synchronized public void deposit(int depoamt)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Banking.balance = Banking.balance + depoamt;
		System.out.println("Deposit : Amount "+depoamt+" is Deposited Updated balance is "+Banking.balance) ;
	}

}

public class DemoMultiWaitNew {

	public static void main(String[] args) {
		
		Banking b1 = new Banking();
			
		Thread t1 = new Thread(new Runnable()
				{
				public void run() {
					b1.deposit(1000);
				}
				} );
	
		
		Thread t2 = new Thread(new Runnable()
		{
		public void run() {
			b1.withdraw(100);
		}
		} );
		
		t1.start();
		t2.start();
		t2.interrupt();
		

	}



}
