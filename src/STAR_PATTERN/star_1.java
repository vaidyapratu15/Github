package STAR_PATTERN;

public class star_1 
{
      public static void main(String[] args) 
      {
	 
    	  //*****  
    	  //*****
    	  //*****
    	  
    	  
    	  for (int i=1; i<=3; i++)       //for 3 rows
    	  {
    		  for (int j=1; j<=5; j++)   //inner loop for in each row 5 star
    		  {
    			  System.out.print("*");
    		  }
    		  System.out.println();
    	  }
    	
    	  System.out.println("---giving some space -----");
    	  
    	  for (int i=1; i<=3; i++) 
    	  {
    		  for (int a=1; a<=5; a++) 	{System.out.print(" "); }      //for space
    		  for (int a1=1; a1<=5; a1++) 	{System.out.print("*"); }
    		  System.out.println();
    	  }
    	 
      }
}
