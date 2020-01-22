import  java.io.*;
import  java.lang.*;

public class Two extends Thread  {
	public void run()
	 {
		System.out.println("Running Thread"+Thread.currentThread().getName());
		System.out.println("Thread Priority is"+Thread.currentThread().getPriority());
	 }
	public static void main(String[] args) {
		Two m1= new Two();
		Two m2= new Two();
		
		 m1.setPriority(Thread.MIN_PRIORITY);
		 m2.setPriority(Thread.MAX_PRIORITY);
		 m1.start();
		 m2.start();
		 // TODO Auto-generated method stub

	}

}
