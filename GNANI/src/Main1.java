import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner emp= new Scanner(System.in);  
	/*	int empid= emp.nextInt();
		String empname =emp.next();
		int esalary=emp.nextInt();
	*/   
		Employee e= new Employee(emp.next(),emp.nextInt());
		Employee e1=new Employee();
	//	Employee e1 = new Employee();
		e.calculatesalary();
		e.dispdetails();

	}

}
