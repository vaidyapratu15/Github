package Exception;

public class sample_9
{
	public static void main(String[] args)
	{
		
		int [] ar=new int[5];    //0-3
		     //  ar [8] = 20;
	//	System.out.println(ar[7]);
		
		
		try 
		{
			ar[8]= 20;       //risky code
		}
		catch (ArrayIndexOutOfBoundsException prtu) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
			
		}  
		
		
		System.out.println("hi");
		System.out.println("hello"); 
	}
}
