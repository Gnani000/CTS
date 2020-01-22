import java.io.*;
public class StudMain {

	public static void main(String[] args) {

		try
		{
		   Student s1= new Student(101,"abc"); 
			FileOutputStream fos =new FileOutputStream("a.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			System.out.println("Return Sucessfully");
			
		}
		catch (Exception e)
		{
			
		}
		try
		{
		  ObjectInputStream ois =new ObjectInputStream(new FileInputStream("a.txt"));
		  Student s2 = (Student)ois.readObject();
		  System.out.println(s2.getId()+" "+s2.getName());
		  ois.close();
		  
		}
		catch (Exception e)
		{
			
		}

	}

}
