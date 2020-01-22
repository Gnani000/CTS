package test;

class access
{
    public int x;
	private int y;
    void cal(int a, int b)
    {
        x =  a + 1;
        y =  b;
    }        
}    
public class nine
{
    public static void main(String args[])
    {
        access obj = new access();   
        obj.cal(2, 3);
      //  System.out.println(obj.x + " " + obj.y);     
    }
}