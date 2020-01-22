import java.util.Scanner;

@FunctionalInterface
interface first
{
	public int add(int a, int b);
}
public class Main1 {

	public static void main(String[] args) {

		 Scanner s= new Scanner(System.in);
		 //String name;
		 first a1=(a,b)->(a+b);
				
			 //return "Hello "+name;
		 System.out.println(a1.add(s.nextInt(),s.nextInt()));
		
	}

}
