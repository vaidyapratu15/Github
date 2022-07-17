package Generalizatin;

public class VI1 implements simcard

{
	 //sub class2
		public void sms()
		{
			System.out.println("SMS : 50 sms");
		}
		
		public void audiocalling()
		{
			System.out.println("audiocalling : 200 call");
		}
		
		public void internet()
		{
			System.out.println("internet : 2 GB data ");
		}
		
		public void newfeatures()   //not accessing this is new in sub class 
		{
			System.out.println("features : B");
		}
}
