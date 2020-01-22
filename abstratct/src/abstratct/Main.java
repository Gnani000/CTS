package abstratct;

public class Main {

	public static void main(String[] args) {
    bank b1=new sbi();
    System.out.println("SBI Rate Of Intrest"+ b1.rate() +"%");
    b1.banktimings();
    bank b2=new icici();
    System.out.println("ICICI Rate Of Intrest"+ b2.rate() +"%");
    b2.banktimings();
    bank b3=new hdfc();
    System.out.println("HDFC Rate Of Intrest"+ b3.rate() +"%");
    b3.banktimings();
	}

}
