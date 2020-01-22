import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
public class three {

	public static void main(String[] args) throws ParseException {

	/*	try {
			while(true) {
		Date d=new Date();
		//System.out.println(d);
		String s=d.toString();
		Thread.sleep(1000);
		}
		System.out.println(s.substring(11,19));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
		//long m=System.currentTimeMillis();
	/*	String s="2019-03-12";
		Date d= Date.valueOf(s);
		System.out.println(d);
	*/
		/*	Calendar calendar = Calendar.getInstance();
		System.out.println("The current date is :"+calendar.getTime());
		calendar.add(Calendar.DATE,-15);
		System.out.println("15 Days to go: "+calendar.getTime() );
		calendar.add(Calendar.MONTH,4);
		System.out.println("4 Months to Go :"+calendar.getTime() );
		calendar.add(Calendar.YEAR,2);
		System.out.println("2 Years To Go  : "+calendar.getTime() );
	  */
		Date d=new Date();
		System.out.println(d);
	    String s=DateFormat.getDateInstance().format(d);
	    System.out.println(s);
	    Date d1=DateFormat.getDateInstance().parse("11 jan, 2020");
	    System.out.println(d1);
	}

}
