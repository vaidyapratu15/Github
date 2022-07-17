package Exception;

public class sample_2
{
	public static void main(String[] args)
	{
		
		int [] ar=new int[4];    //0-3
		     //  ar [7] = 20;
	//	System.out.println(ar[7]);
		
	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 4
		//at Exception_29_4.sample_2.main(sample_2.java:9)	
		try 
		{
			ar[7]= 20;       //risky code
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
			
		}  
		
		
		System.out.println("hi");
		System.out.println("hello"); 
	}
}
