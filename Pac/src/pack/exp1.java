package pack;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class exp1  {

	public static void main(String[] com) //throws Exception
	{
     //  try // Gaurded Section
       {
		int a,b,c;
		
		//a=s.nextInt();
		//b=s.nextInt();
		a=Integer.parseInt(com[0]);
		b=Integer.parseInt(com[1]);
	//	Scanner s= new Scanner(System.in);
		c=a/b;
		System.out.println("Result "+c);
       }
		// catch (ArithmeticException e)  //Exception Handler
       {
		//	 System.out.println("Error : Try with other inputs "+e );
       }
    //   catch (Exception e)  //Exception Handler
       {
	//		 System.out.println("Error : Try with only +ves "+e );
       }
      // finally
       {
    //	System.out.println("Error");   
       }
		
 	}

}
