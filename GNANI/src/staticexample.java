
public class staticexample {
	public void func2()
	{
		System.out.println("Inside static");
	}
	
	public static void main(String[] args) {
        System.out.println("Inside Main");
        staticexample b=new staticexample();
        b.func2();
        System.out.println("After Main");
	}

}
