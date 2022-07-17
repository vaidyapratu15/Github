package inheritance_access_specifiers;

public class access_protected3 
{
	  protected int a ;
     
      
      protected access_protected3()
      {
            a=10;
   	  }
      
      protected void m1 ()
      {
   	   System.out.println(a);
      }
      
      
      
      public static void main(String[] args)
      {
   	           access_protected3  a = new access_protected3();
   	                         a.m1();
   	
	   }
	
	
}
