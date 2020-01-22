package pack;
import java.util.*;

public class Main4 {

	public static void main(String[] args) {

		  Map m=new TreeMap();
		  m.put("one", 1);
		  m.put("two", 2);
		  m.put(3, "sat");
		  m.put(3, "mon");
		  System.out.println(m);
		  System.out.println(m.keySet());
		  System.out.println(m.values());
		  System.out.println(m.entrySet());
		  System.out.println(m.get(3));
		  
	}

}
