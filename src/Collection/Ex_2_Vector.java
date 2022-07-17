package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex_2_Vector 
{
      public static void main(String[] args)
      {
    	  Vector a = new Vector();
    	  a.add("pratiksha");  a.add("pratiksha"); a.add("pratiksha");
    	  a.add(null);   a.add(null);   a.add(null);
    	  
    	  System.out.println(a);
    	  System.out.println(a.size());
    	  System.out.println(a.contains("aaaa"));
    	  System.out.println(a.get(3));
    	  
    	  a.add(2, "vaidya");  System.out.println(a);
    	  
    	  a.remove(1);  System.out.println(a);
    	  
    	  a.set(0, "Rani");    System.out.println(a);
    	  
    	  Iterator itr = a.iterator();
    	  while(itr.hasNext())
    	  {
    		  System.out.println(itr.next());    
    	  }                                              System.out.println("-----");
     
    	  ListIterator litr = a.listIterator();
    	  while(litr.hasNext())
    	  {
    		  System.out.println( litr.next());
    	  }                                             System.out.println("----------------");
      
          for(int i=0; i<=a.size()-1; i++)
          {
        	  System.out.println(a.get(i)); 
          }                                              System.out.println("------------------");
       
          for (Object z : a)
          {
        	  System.out.println(z);                      
          }                                              System.out.println("------------");  
   
      
         Enumeration er = a.elements();
         while(er.hasMoreElements())
         {
        	 System.out.println(er.nextElement());
         }
      
      
      
      
      }
}
