package Array;

public class Single_Step_intArray1 
{
     public static void main(String[] args)
     { 
System.out.println("----------String----------------------------");     	 
		int [] ar = { 50, 30, 40, 10, 20};
		
		//Ascending           
        for (int i=0; i<=ar.length-1; i++)
     	           //i<=4   //size-1 (5-1=4)
        {
     	   System.out.println(ar[i]);
        }
        //descending  
        System.out.println("-------reverse--------");
        for (int i=4; i>=0; i--)
        {
     	   System.out.println(ar[i]);
        }
System.out.println("----------String----------------------------");
   	 
      		String [] sr = { "pratu" , "rani" , "queen" };
      		
      		//Ascending           
              for (int i=0; i<=sr.length-1; i++)
           	           //i<=4   //
              {
           	   System.out.println(sr[i]);
              }
              //descending  
              System.out.println("-------reverse--------");
              for (int i=2; i>=0; i--)
              {
           	   System.out.println(sr[i]);
              }      
        
        
	 }
}
