package Array;

import java.util.Arrays;

public class Sorting_StringArray_2
{

    public static void main(String[] args)
    {
	  String [] sr = new String[3];
 	            sr [0] = "pratibha";
 	            sr [1] = "pallavi";
 	            sr [2] = "pratiksha";
 	 
 	    System.out.println(sr[2]);  //pratiksha
 	    System.out.println("size of array = " +sr.length);  // 3
 	    
 	   System.out.println("------orignal ascending---");                           
       for (int i=0; i<=sr.length-1; i++)        {   System.out.println(sr[i]);  } 

       
      Arrays.sort(sr);                                                         //Array sorting  
      
      System.out.println("------orignal ascending---");
      for (int i=0; i<=sr.length-1; i++)        {   System.out.println(sr[i]);  }  
 
       System.out.println("-------sorting reverse--------");
       for (int i=2; i>=0; i--)                 {   System.out.println(sr[i]); }  
       
 	    
    }
}
