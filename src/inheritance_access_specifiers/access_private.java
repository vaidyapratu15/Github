package inheritance_access_specifiers;

public class access_private
{
       private int a ;
       private int b;
       
       private access_private()
       {
    	   a=10;
    	   b=20;
       }
       
       private void m1 ()
       {
    	   System.out.println(a);
       }
       
       private void m2 ()
       {
    	   System.out.println(b);
       }
       
       private void addition ()
       {
    	   System.out.println(a+b);
       }
       
       public static void main(String[] args)
       {
    	 access_private a = new access_private();
    	 a.m1();
    	 a.m2();
    	 a.addition();

	   }
}
