
public class Student {
	int sid,m1,m2,m3,avg;
	String sname;
	float annaualsal;
	public void getdetails()
	{
		sid=101;
		sname="Gnani";
		m1=90;
		m2=90;
		m3=80;
				
	}
	
	public void dispdetails()
	{
		System.out.println("Name :"+sname);
		System.out.println("Average :"+avg);
		if(avg>85)
		{
			System.out.println("Grade : A");
		}
		else if(avg>=65)
		{
			System.out.println("Grade : B");
		}
		else if(avg>=50)
		{
			System.out.println("Grade : C");
		}
		else if(avg<50)
		{
			System.out.println("Grade : Fail");
		}	
	}
	 
	public void average()
	{
		avg=(m1+m2+m3)/3;
		
	}

}
