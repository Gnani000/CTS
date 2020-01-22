package eleven1;
import java.io.*;
public class Two {

	public static void main(String[] args) {
		try
			{
	           File f=new File("e.txt");
	           if(f.createNewFile())
	           {
	        	   System.out.println("New File Is Created");
	           }
	           else
	        	   System.out.println("File already Exists" );
			
				}
catch (Exception e)
		{
	
		}
	}

}
