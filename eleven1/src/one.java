import java.io.*;
public class one {

	public static void main(String[] args) {
	
		 /* try {
			// File  f= new File("a.txt");
			  FileInputStream fis = new FileInputStream("");
			  int i;
			  while ((i=fis.read())!=-1)
             {
            	 System.out.print((char)i);
             }
		   }
		  catch (Exception e) 
		    {	 	
 			e.printStackTrace();
    		}
        */
		/*	try {
			 File  f= new File("b.txt");
			  FileOutputStream fis = new FileOutputStream(f);
			  String a="Helol World";
			  byte b[]=a.getBytes();
			  fis.write(b);
			  System.out.println("Written Sucessfully");
		   }
		  catch (Exception e) 
		    {	 	
 			e.printStackTrace();
    		}
    	*/
		/*	try {
			 File  f= new File("a.txt");
			  FileOutputStream fis = new  FileOutputStream(f);
			  BufferedOutputStream bis = new BufferedOutputStream(fis);
			  String a="Hello";
			  byte b[]=a.getBytes();
			   fis.write(b);
					  System.out.print(b);
 		   }
		  catch (Exception e) 
		    {	 	
			e.printStackTrace();
   		}
   		*/
		/* try {
			    DataOutputStream dout= new DataOutputStream(new FileOutputStream("a.dat"));
			    dout.writeDouble(1.1);
			    dout.writeInt(55);
			    dout.writeBoolean(true);
			    dout.writeChar('4');
			    }
		catch(Exception e)
		{
			System.out.println("Cannot Open the Output File");
			return;
		}
		 
		 try {
			 File  f= new File("a.dat");
			  FileInputStream fis = new  FileInputStream(f);
			  DataInputStream din = new DataInputStream(fis);
			  double a=din.readDouble();
			  int b=din.readInt();
			   boolean c= din.readBoolean();
			   char d=din.readChar();
					  System.out.print(a+" "+b+" "+c+" "+d);
		   }
		  catch (Exception e) 
		    {	 	
			e.printStackTrace();
  		}
  		*/
		
	}

}
