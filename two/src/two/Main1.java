package two;
import java.util.*;

public class Main1 {

	public static void main(String[] args) {
 
		 ArrayList<Employee> l = new ArrayList<Employee>();
		 l.add(new Employee(102,"Abc"));
		 l.add(new Employee(107,"xyz"));
		 l.add(new Employee(101,"pqr"));
		 System.out.println(l);
     		Collections.sort(l);
	    	System.out.println(l);
		
	}

}
