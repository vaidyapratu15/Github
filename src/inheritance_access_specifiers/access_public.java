package inheritance_access_specifiers;

public class access_public 
{     

	  public  int a ;
	  
	  public access_public ()
	  {
		  a = 100;
	  }
	  
	  public  void m1 ()
	  {
		  System.out.println(a);
	  }
	  
	  public static void main(String[] args) 
	  {
		   
		    access_public q = new access_public();
		    q.m1();
	  }
}
