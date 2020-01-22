package eleven1;
import java.io.*;

public class Three {

	public static void main(String[] args) {
      try {
    	  File f= new File("C:/Users/DELL/eclipse-workspace/eleven1");
    	  String a[]=f.list();
    	  for(String s:a )
    	  {
    		  System.out.println(s);
    	  }
    	 }
      catch(Exception e)
      {
    	  
      }
	}

}
