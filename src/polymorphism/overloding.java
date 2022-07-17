package polymorphism;

public class overloding
                        //overloading /compile time polymorphism

          //same method name with diff i/p in same class
{
         //addition with 2 parameters
	    public void addition  (long l , int b)
	    {
	    	System.out.println(l+b);
	    }
	    
	    //addition with 3 parameters
	    public void addition  (int a , int b , int c)
	    {
	    	System.out.println(a+b+c);
	    }
	    
	    public static void main(String[] args) 
	    {
			overloding a1 = new overloding();
			a1.addition(100000000l, 20);    //binding at compile time which is depend on parameter
			a1.addition(1000, 2000, 3000);
		}
}
