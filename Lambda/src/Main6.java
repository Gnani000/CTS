import java.util.*;

public class Main6 {

	public static void main(String[] args) {

		List<Employee> l1= new ArrayList<Employee>();
        l1.add(new Employee(1,"za",25000));
        l1.add(new Employee(2,"ab",19000));
        l1.add(new Employee(3,"gk",24000));
        l1.add(new Employee(5,"cd",25000));
        l1.add(new Employee(4,"ef",19000));
        l1.add(new Employee(6,"gkv",24000));
        System.out.println("Sorting based on Names");
        Collections.sort(l1,(p1,p2)->{
        	return p1.name.compareTo(p2.name);});
        for(Employee e:l1)
        {
        	System.out.println(e);
        }
        }
	}
