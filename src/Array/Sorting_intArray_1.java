package Array;

import java.util.Arrays;

public class Sorting_intArray_1  //int
{
    public static void main(String[] args) 
    {
		//Step 1 : Array declaration 
    	int [] ar = new int[5]; 
    	
    	//Step 2 : Array initialization 
             ar [0] = 50; 
             ar [1] = 30;
             ar [2] = 40;
             ar [3] = 20;
             ar [4] = 10; 
                                                                                   //0  1  2 3  4
       //Step 3 : usage 
       System.out.println("Size of Array = " + ar.length);   //5
       System.out.println("------orignal ascending---");                           
       for (int i=0; i<=ar.length-1; i++)        {   System.out.println(ar[i]);  } //50 30 40 20 10

       
      Arrays.sort(ar);                                                         //Array sorting  
      
      System.out.println("------orignal ascending---");
      for (int i=0; i<=ar.length-1; i++)        {   System.out.println(ar[i]);  }  //10 20 30 40 50 
 
       System.out.println("-------sorting reverse--------");
       for (int i=4; i>=0; i--)                 {   System.out.println(ar[i]); }  //50 40 30 20 10
       
      
	}
}
