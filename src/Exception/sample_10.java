package Exception;

public class sample_10
{
	public static void main(String[] args)
	{
		
		int [] ar=new int[4];   
		
		try 
		{
			ar[7]=10;       //risky code
		}
		catch (ArithmeticException e)     //here using multiple catch , it will print in which correct exception is there 
		{
			System.out.println("Arithmetic Exception handled");     
		}
		catch (NullPointerException e)              
		{
			System.out.println("NullPointer Exception handled");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");			
		}
		
		
		System.out.println("hi");
		System.out.println("hello");
		
	}
}
