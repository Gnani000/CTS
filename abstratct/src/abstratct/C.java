package abstratct;

public class C implements A,B {

	public static void main(String[] args) {
     C a1=new C();
     a1.dispA();
     a1.dispB();
	}

	@Override
	public void dispB() {
    System.out.println("Interface A"+a);		
	}

	@Override
	public void dispA() {
	    System.out.println("Interface B");		
		
	}

}
