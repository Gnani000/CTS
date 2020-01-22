
public class Main3 {

	public static void main(String[] args) {

		Runnable r= new Runnable()
				{
	     public void run()
	     {
	    	 System.out.println(" Thread 1 Running");
	     }
				};
		Thread t= new Thread(r);
		t.start();
		Runnable r1=()->
		{
			System.out.println("Thread 2 Running");
		};
		Thread t2=new Thread(r1);
		t2.start();
	}

}
