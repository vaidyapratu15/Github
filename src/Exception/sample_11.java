package Exception;

public class sample_11 
{
	 public static void main(String[] args) 
	    {
			
			       int [] ar=new int[6];   
			
			       try
			       {
				        ar[9]=10;   
			       }
			       catch(Exception e)     
		           {
			        	System.out.println("generic exception handled");
				        e.printStackTrace();         
			       }
			 		
			
			            System.out.println("gggggmmmmm");
			            System.out.println("hello");
			
		}
}
