package Generalizatin;

public class Jio implements simcard

{
     //sub class1
	public void sms()
	{
		System.out.println("SMS : No");
	}
	
	public void audiocalling()
	{
		System.out.println("audiocalling : unlimited");
	}
	
	public void internet()
	{
		System.out.println("internet : 1 GB data ");
	}
	
	public void newfeatures()   //not accessing this is new in sub class 
	{
		System.out.println("features : A");
	}
	
}
