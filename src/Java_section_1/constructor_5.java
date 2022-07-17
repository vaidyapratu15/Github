package Java_section_1;

public class constructor_5
{
            int num1;
            int num2;
            
            constructor_5() 
            {
			     num1= 10;
			     num2 = 5;
			}
             
            constructor_5 ( int a, int b)
            {
            	num1 = a;   num2 = b;
            }
	       
	       public void arithmatic ()
	       {
	    	   System.out.println(num1 + num2);   System.out.println(num2-num1);   System.out.println(num1*num2);
	       }
	       
	       public void addsub()
	       {
	    	   System.out.println(num1+num2);  System.out.println(num1-num2);
	       }
	       
	       public void muldiv()
	       {
	    	   System.out.println(num1*num2);  System.out.println(num1/num2);  
	       }
	       public static void main(String[] args) 
	       {
	    	   constructor_5 c = new constructor_5();   c.arithmatic();   

	    	   constructor_5 c1 = new constructor_5(100 , 20);   c1.addsub();  
	    	   
	     	   constructor_5 c2 = new constructor_5(500 , 50);   c2.muldiv();  
	       }
	 
	
	      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
