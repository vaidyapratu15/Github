package polymorphism;

public class test_father_son
{
   public static void main(String[] args)
   {    
	   System.out.println("orignal father property");
	    superclass s= new superclass();
	               s.m1();
	               s.money();                              System.out.println();
	               
	    System.out.println("accessing property");          
	    subclass s1 =new subclass();
	             s1.m1();
	             s1.home();
	             s1.money();                         System.out.println();
	             
	    System.out.println("upcasting");
	    superclass f = new subclass();
	               f.m1();
	               f.money();
	    
   }
}
