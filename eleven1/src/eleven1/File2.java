package eleven1;

import java.io.*;
public class File2 {

	public static void main(String[] args) {
		/*try 
		{
			FileReader fr=new FileReader("C:/Users/DELL/eclipse-workspace/GNANI/src/Employee.java");
			FileWriter fw= new FileWriter("c.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				 fw.write((char)i);
			}
			System.out.print("Written Sucessfuly");
            fw.close();
			}
		catch(Exception e)
		{
			
		}*/
	/*      try
      {
		 FileOutputStream fos= new FileOutputStream("c.txt");
		 PrintStream ps = new PrintStream(fos);
		 ps.println(2020);
		 ps.println("Hello Java");
		 ps.println("Welcome to Java");
		 ps.close();
         fos.close();
         System.out.println("Written Sucessfully");
	}
      catch(Exception e)
      {
    	  
      }
  */
		try
		{
			PrintWriter pw =new PrintWriter(System.out);
			pw.write("hai");
			pw.flush();
			pw.close();
			PrintWriter pw1 = null;
			pw1=new PrintWriter(new File("d.txt"));
			pw1.write("Hell Welcome To JAVA");
		    pw1.flush();
		    pw1.close();
			System.out.println(pw1);
		}
		catch (Exception e)
		{
			
		}

}
}