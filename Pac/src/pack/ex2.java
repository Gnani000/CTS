package pack;



	 class MyException extends Exception
	 {
		 int a,b;
		 MyException(int a,int b) {
			 this.a=a;
			 this.b=b;
	 }
		 public String toString() 
		 {
			 return "The value should not be > 20";
		 }
			 
		 }
 public class ex2 {
	
	
    public static void cal(int a, int b) throws MyException
    {
    	int sum=a+b;
    	if(sum>20)
    	throw new MyException(a,b);
    	System.out.println("The Result is "+sum);
    	
    }
    public static void main(String[] args) throws MyException 
	{
		try
    {
    	cal(3,4);
    	cal(3,14);
    	cal(11,15);
    	cal(3,14);
    	
    }
    catch(MyException e)
    {
      System.out.println(e);	
    }
		 
	}

}
