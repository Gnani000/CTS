package test;

class  
{
    public int i;
    private int j;
}    
class x extends A 
{
    void display() 
    {
        super.j = super.i + 1;
        System.out.println(super.i + " " + super.j);
    }
}    
class four 
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.i=1;
        obj.j=2;   
  //    obj.display();     
    }
}

