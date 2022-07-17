package Exception;

public class sample_4 
{
    public static void main(String[] args) 
    {
		
		       int [] ar=new int[4];   
		
		       try
		       {
			        ar[9]=10;   
		       }
		       catch(Exception e)     //this is super exception we use this when we dont know which exception in prgm 
	           {
		        	System.out.println("generic exception handled");
			        e.printStackTrace();        //by using objectname.printStackTrace -->we finding which exception is here 
		       }
		 		
		
		            System.out.println("hi");
		            System.out.println("hello");
		
	}
}
