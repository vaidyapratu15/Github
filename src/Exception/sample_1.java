package Exception;

public class sample_1 
{
    public static void main(String[] args)
    {
    	   int a = 10;
    	   int b = 0;
    	   int c = 0;
    	   
    	   
    	   
    	 //  int c = a/b;
        // System.out.println(c);
    	   
    	//Exception in thread "main" java.lang.ArithmeticException: / by zero
    	//	at Exception_29_4.sample_1.main(sample_1.java:9)

    
    	try 
    	{
    	     c=a/b; 	//10/0 =0      // risky code
    	}
    	catch (ArithmeticException aa)
    	{
    		System.out.println("ArithmeticException ");
    		c = a/1;     //alternate solution ----> optional
    	}
    	
    	
    	System.out.println(c);
    	System.out.println("hii ");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	}
}
