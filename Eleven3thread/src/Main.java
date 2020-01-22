import  java.io.*;
import  java.lang.*;

public class Main extends Thread 
 {
	Main(String s)
	{
		this.setName(s);
	}
	public void run()
	 {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("After Sleep");
		}
			System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) 
	{
		
		Main m= new Main("Child 1");
        Main m1= new Main("Child 2");			
        Main m2=new Main("Child 3");
        Main m3=new Main("Child ");
        try {
			m.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        m.start();
        m1.start();
       // m2.start();
     //   m3.start();
	}
}
 
      