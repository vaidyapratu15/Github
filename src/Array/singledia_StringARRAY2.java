package Array;

public class singledia_StringARRAY2
{
       public static void main(String[] args)
       {
		  //Step 1 : array declaration 
    	   String [] sr = new String[3];
    	   
    	   //Step 2 : array initialization 
    	            sr [0] = "pratibha";
    	            sr [1] = "pallavi";
    	            sr [2] = "pratiksha";
    	   
    	  //Step 3 : usage
    	    System.out.println(sr[2]);  //pratiksha
    	    System.out.println(sr.length);  // 3
    	    
 //ascending  	    
    	    for (int i=0; i<=2; i++)
    	    {
    	    	System.out.println(sr[i]);
    	    }
    	    
	   }
}
