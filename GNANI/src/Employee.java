import java.util.*;
public class Employee 
{
  static int eid=1;int age;
	String ename;
	int salary;
	int annaualsal;
	Employee( String en, int sal )
	{
		//eid=ed;
		ename=en;
		salary=sal;
	}
	Employee()
	{
		System.out.println("Default Constructor");
	}
	/*public void getdetails()
	{
		eid=101;
		ename="Gnani";
		salary=20000.50f;
	}*/
	
	
	public void dispdetails()
	{
		System.out.println("Id :"+eid+"\nName :"+ename+"\nSalary :"+annaualsal);
	}
	
	public void calculatesalary()
	{
		annaualsal=salary*12;
	}

 }

