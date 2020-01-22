import java.util.Scanner;

public class MOverloading {
	final float PI=3.14f;
	int a=5;
	int area1(int a, int b)  //Rectangle
	{
		int len=a,bre=b;
		System.out.println("Area of rectangle"+len*bre);
	   	   return len*bre;
	}
	 int area1()//
	 {
          this.a=a;
		 System.out.println("Area of Square"+(a*a));
		 return a*a;
	 }
	 float area1(float c)//
	 {
		 float a2=c;
		 System.out.println("Area of Circle"+PI*a2*a2);
		 return PI*a2*a2;
	 }
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
//		float c=s.nextInt();
		MOverloading mo=new MOverloading();
		int rec= mo.area1(a,b);
	     int sq= mo.area1();
		float cir=mo.area1(a);
		
	}

}
