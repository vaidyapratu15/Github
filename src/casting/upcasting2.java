package casting;

public class upcasting2
{
      public static void main(String[] args)
      {
		
    	  System.out.println("orignal superclass property");
    	  superclass a = new superclass();
    	  a.m1();  a.m2();                                          System.out.println();
    	  
    	  System.out.println("accessing property");
    	  subclass s = new subclass();
    	  s.m1(); s.m2();  s.m3(); s.m4();                         System.out.println();
    	  
    	  System.out.println("upcastig ");
    	  superclass d = new subclass();
    	  d.m1();   d.m2();
	  }
}
 