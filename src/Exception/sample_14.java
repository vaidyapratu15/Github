package Exception;

public class sample_14
{
	public static void main(String[] args)
	{
		
		try                  //outer try block
		{      
			try                       //inner or nested try block
			{
				//risky code 1
			}
			catch (Exception e)
			{
				
			}
			
			//risky code 2
					
		} 
		catch (Exception e)
		{
			
		}
		
		
		System.out.println();
	}  
}
