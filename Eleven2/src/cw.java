
class  customer
	{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw");
		if(this.amount<amount)
		{
			System.out.println("Less balance waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount-=amount;
			System.out.println("WithDraw Completed");
		}
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to Deposit");
		this.amount+=amount;
		System.out.println("Deposit Completed");
		notify();
	}
	}

public class cw 
{
	public static void main(String[] args) 
{

      final customer c1=new customer();
      new Thread()
      {
      public void run()
      {
    	  c1.withdraw(15000);
      }
      }.start();
      new Thread()
      {
    	  public void run()
          {
        	  c1.deposit(10000);
          }
          }.start();
    	}	  
}

