package polymorphism;

public class overload2
{
	  //addition with 2 parameters
    public void addition  (long a , long b)
    {
    	System.out.println(a+b);
    }
    
    //addition with 3 parameters
    public void addition  (int a , int b , int c)
    {
    	System.out.println(a+b+c);
    }
    
    public static void main(String[] args) 
    {
		overloding a1 = new overloding();
		a1.addition(100000000000l , 20);    //binding at compile time which is depend on parameter
		a1.addition(10, 20, 30);
	}
}
