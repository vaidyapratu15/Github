package Array;

import java.util.Arrays;

public class class_int_Sorting_dec
{ 
	
	public static void main(String[] args) {
		
		
		int [] ia = { 100, 10, 1, 1000};
		
		
		System.out.println("------int descening-----------");
		
		for (int i=ia.length-1; i>=0; i--)        
		{ 
			System.out.println(ia[i]);
		}
		
	System.out.println("------------------------------------Sorting(permanent change)--------------------------");	
		
		Arrays.sort(ia);                                                       
		
		
		System.out.println("------Sorting int descening-----------");
		for (int i=ia.length-1; i>=0; i--)    
		{
			System.out.println(ia[i]);
		}
		
	
		
	   }

}
