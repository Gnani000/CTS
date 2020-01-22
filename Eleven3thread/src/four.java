import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class four {

	public static void main(String[] args) {

		Date date=new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYYY");
		String strDate = formatter.format(date);
		System.out.println(strDate);

	}

}
