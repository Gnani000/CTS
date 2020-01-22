package test;


class bx 
{
    int width;
    int height;
    int length;
} 
class three 
{
    public static void main(String args[]) 
    {        
    	bx obj1 = new bx();
    	bx obj2 = new bx();
        obj1.height = 1;
        obj1.length = 2;
        obj1.width = 1;
        obj2 = obj1;
        System.out.println(obj2.height);
    } 
}
