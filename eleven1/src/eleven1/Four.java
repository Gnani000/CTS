package eleven1;
import java.io.*;
public class Four {

	public static void main(String[] args) {

		  try 
		  {
			File f= new File("C:/Users/DELL/eclipse-workspace/eleven1");
			File f1[]= f.listFiles();
			for(File f2:f1)
			{
				System.out.print (f2.getName()+" "+f2.getPath()+" "+f2.getAbsolutePath()+" "+f2.canRead()+" "+f2.canWrite()+" "+f2.isHidden()+" "+f2.length()+"Bytes");
			}
			  
		  }
		  catch (Exception e)
		  {
			  
		  }
		
	}

}
