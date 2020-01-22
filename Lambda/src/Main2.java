import java.util.*;
interface i2
{
	String say(String msg);
}

public class Main2 {

	public static void main(String[] args) {

		/*List l= new ArrayList();
		l.add(4);
		l.add(2);
		l.add(6);
		l.forEach((n)->System.out.println(n));
		*/
		i2 i=(msg)->{
			String s1="Hello how Are You";
			String s2=s1+msg;
			return s2;
		};
		System.out.println(i.say(" I AM Fine"));
	}

}
