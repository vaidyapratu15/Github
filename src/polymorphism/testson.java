package polymorphism;

public class testson
{
   public static void main(String[] args)
   {
	   System.out.println("---------father original property ----------");
	   //father original property
	   father f1 = new father();
	          f1.car();
	          f1.money();
	          f1.home();  
	          
	 System.out.println("---------son property upgrade----------");         
	          //son update property
	   	      son s1 = new son();
	   	          s1.car();   //override
	   	          s1.money();  //override
	   	          s1.home();   
	
	   	          
	   //only for understanding 
//   System.out.println("---------upcasting ----------");     	         
//   
//              father a1 = new son();
//              a1.car();  a1.money();  a1.home();
   }
}
