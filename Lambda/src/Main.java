@FunctionalInterface
interface inter1
{
	public void disp();
}
public class Main {

	public static void main(String[] args) {
		 int width=9;
		inter1 a1=()->{
			System.out.println(width*2);
		};
		a1.disp();
	}

}
