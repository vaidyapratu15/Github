package inheritance_access_specifiers;

public class access_default2 
{
           int a;
          
           access_default2() 
           {
			  a=10;
		   }
    
	      void m1()
	      {
	    	  System.out.println(a);
	      }
	
	      public static void main(String[] args) 
	      {
			
	    	  access_default2 a= new access_default2();
	    	  a.m1();
		  }
}
