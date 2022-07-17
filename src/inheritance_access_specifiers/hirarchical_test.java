package inheritance_access_specifiers;

public class hirarchical_test
{
	public static void main(String[] args) 
	{   
		 
		 hirarchical_sub1 s1 = new hirarchical_sub1();
		                  s1.home();
		                  s1.car();                          System.out.println();
		                  
		 hirarchical_sub2 s2 = new hirarchical_sub2();
		                  s2.home();
		                  s2.newhome();                     System.out.println();
		                  
		hirarchical_sub3 s3 = new hirarchical_sub3();
		                 s3.home();
		                 s3.mob();
		
	}

}
