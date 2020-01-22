import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
	public static void main(String[] arg)
	{
		List<Employee> l1= new ArrayList<Employee
				
				>();
		 l1.add(new Employee(1,"za",25000));
	        l1.add(new Employee(2,"ab",19000));
	        l1.add(new Employee(3,"gk",24000));
	        l1.add(new Employee(5,"cd",25000));
	        l1.add(new Employee(4,"ef",19000));
	        l1.add(new Employee(6,"gkv",24000));
	    	List<Integer> l2= l1.stream().filter(p->p.salary>22000).map(p->p.salary).collect(Collectors.toList());
	    	System.out.println(l2);
	        
	}

}
